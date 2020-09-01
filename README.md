# Java Exception Handling

A place to play with some of the "Exception Patterns" described [here](http://wiki.c2.com/?ExceptionPatterns)

### Exception Nesting
 
We can rethrow low-level exceptions with additional information, bringing extra clarity to our stack trace as we let the error "bubble up".
 
```
// in MidLevel.class
 
try {
    bottomLevel.call();
} catch (BottomLevelException e) {
    throw new MidLevelException("There was an issue at the mid level", e);
}
 ```
 
At the top level, we can either:
1. Throw the exception and halt the application
2. Log the exception and let the programme continue

(Our handling approach very much depends on our context)

Either way, we get a nice amount of information in the stack trace:

```
ExceptionNesting.TopLevelException: There was an issue at the top level
	at ExceptionNesting.TopLevel.callAndThrowException(TopLevel.java:15)
	at ExceptionNesting.TopLevelTest.callAndThrowException_programHalts(TopLevelTest.java:18)
	...
	
Caused by: ExceptionNesting.MidLevelException: There was an issue at the mid level
	at ExceptionNesting.MidLevel.call(MidLevel.java:15)
	at ExceptionNesting.TopLevel.callAndThrowException(TopLevel.java:13)
   ...
   
Caused by: ExceptionNesting.BottomLevelException: There was an error in the bottom level
	at ExceptionNesting.BottomLevel.call(BottomLevel.java:6)
	at ExceptionNesting.MidLevel.call(MidLevel.java:13)
	...
```

Note that we don't log and rethrow as this would result in duplicate logs refering to the same exception.

>Log or throw. Don't do both

 
 

 
 
 
 