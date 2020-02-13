package java_interview_questions;

   /*
  
     Polymorphism we can perform a single action in different ways. So polymorphism means many forms.
     
     There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. 
     We can perform polymorphism in java by method overloading and method overriding.

     If you overload a static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime 
     polymorphism in java.
     
  1)  Runtime Polymorphism in Java:-
      Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime 
      rather than compile-time.

     In this process, an overridden method is called through the reference variable of a superclass. The determination of the method
      to be called is based on the object being referred to by the reference variable.

  Note:- Since Object is the root/super class of all classes in Java, so we can write B IS-A Object.


   2) What is the difference between compile-time polymorphism and runtime polymorphism?

    	 compile-time polymorphism	                               Runtime polymorphism
	  In compile-time polymorphism, call to a method is resolved   In runtime polymorphism, call to an overridden method is
	  at compile-time.	                                           resolved at runtime.
	  It is also known as static binding, early binding, or        It is also known as dynamic binding, late binding,  
	  overloading.	                                               overriding, or dynamic method dispatch.
	  Overloading is a way to achieve compile-time polymorphism    Overriding is a way to achieve runtime polymorphism in which,
	  in which, we can define multiple methods or constructors     we can redefine some particular method or variable in the 
	  with different signatures.	                               derived class. By using overriding, we can give some specific
	                                                               implementation to the base class properties in the derived  
                                                                   class.
      It provides fast execution because the type of an object     It provides slower execution as compare to compile-time 
      is determined at compile-time.	                           because the type of an object is determined at run-time.
      Compile-time polymorphism provides less flexibility          Run-time polymorphism provides more flexibility because all
      because all the things are resolved at compile-time.	        the things are resolved at runtime. 


*
*/



public class Polymorphism 
{

}
