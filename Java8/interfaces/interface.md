Interface is an abstract type that contains a collection of methods and constant variables. 
It is one of the core concepts in Java, which enables abstraction, polymorphism, and multiple inheritances.

__In an interface, we’re allowed to use:__
constants variables
abstract methods
static methods
default methods
An abstract modifier will be added automatically by compiler

__In an interface, we're not allowed are:__
we can't instantiate interfaces directly
an interface can be empty without having methods or variables in it
we can't use the final word in the interface definition, because it will end up with a compiler error
all the interface declarations should have the public or default access modifier.
an interface method can't be protected or final
up until Java 9, interface methods could not be private; however, Java 9 introduced the possibility to define private methods in interfaces
interface variables are public, static, and final by definition; we’re not allowed to change their visibility


By implementing the _Comparable interface_, a class indicates that its instances can be compared to one another. 
The Comparable interface consists of a single method called compareTo(), which returns an integer value representing the comparison result.

The primary limitation of Comparable is that it allows only one natural ordering for the objects of a class. When you implement Comparable, you define a single way to compare objects, which is used whenever the objects are sorted or compared. 

If you need to sort objects by different attributes or in different orders, you will have to modify the class or create new implementations of Comparable. 


The Comparator interface defines a single method called compare(), which takes two objects as input and returns an integer value indicating the comparison result.
This interface allows you to create separate comparison logic without modifying the original class.
