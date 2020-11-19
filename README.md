# Interfaces with default methods

Knowing that is possible to write a class which implements one or multiple simple interfaces,
even if those interfaces have one or more common methods in their contracts  
(and in this case we only need to provide a single implementation),  
once i was introduced to **interfaces with default method implementation** i questioned what happens if we try to write a class
which implements two interfaces that both have a default implementation for the same method signature.  

## The example  

In the example i provide in this repo i have two interfaces `InterfaceA` & `InterfaceB`  
which basically have two methods:  

* a `default` method `void whereAmI()`, that prints a simple string to help us understard which of the two default implementation is taken into consideration;  
* and a method `void otherMethod()` just to confirm what is being said in the abstract.  

Then i have a class `Test` that implements the two interfaces and has a blank implementation of `otherMethod()`.  
Finally a `Main` class to make use of the `Test` class.  
For sake of semplicity i didn't organize the code in packages or inside of a src folder

## Result  

I tought that the implementation that would be taken into consideration was choosen based on the order in which i declare that class `Test` implements `InterfaceA` and `InterfaceB`, but in reality what i get is a compilation error:
> Test.java:1: error: types InterfaceA and InterfaceB are incompatible;  
public class Test implements InterfaceA, InterfaceB {  
>
> class Test inherits unrelated defaults for whereAmI() from types InterfaceA and InterfaceB  
1 error  

