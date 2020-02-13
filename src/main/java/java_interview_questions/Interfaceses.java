package java_interview_questions;


   /*
   
   
  1) What is the interface?
     The interface is a blueprint for a class that has static constants and abstract methods. It can be used to achieve 
     full abstraction and multiple inheritance. It is a mechanism to achieve abstraction. There can be only abstract methods 
     in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.
      In other words,
     you can say that interfaces can have abstract methods and variables. Java Interface also represents the IS-A relationship. 
     It cannot be instantiated just like the abstract class. However, we need to implement it to define its methods.
     Since Java 8, we can have the default, static, and private methods in an interface.
     
  2) What is a marker interface?
     A Marker interface can be defined as the interface which has no data member and member functions. 
     For example, Serializable, Cloneable are marker interfaces. 
*
*    public interface Serializable{    
     }  
     
     Note:- What is a functional interface?
     
     In Java, a Marker interface is an interface without any methods or fields declaration, means it is an empty interface. 
     Similarly, a Functional Interface is an interface with just one abstract method declared in it. Runnable interface is 
     an example of a Functional Interface. It has only run() method declared in it.

     Lambda expression works on functional interfaces to replace anonymous classes.

     @FunctionalInterface is a new annotation added in Java 8 to indicate that an interface declaration is intended to be a 
     functional interface as defined by the Java Language Specification. @FunctionalInterface can be used for compiler level 
     errors when the interface you have annotated is not a valid Functional Interface.
     
     A functional interface is an interface that contains only one abstract method. They can have only one functionality to 
     exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. A 
     functional interface can have any number of default methods. Runnable, ActionListener, Comparable are some of the 
     examples of functional interfaces.
     
     Important Points/Observations:

     A functional interface has only one abstract method but it can have multiple default methods.
     @FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method. The use of 
     this annotation is optional.
     The java.util.function package contains many builtin functional interfaces in Java 8.
     
  3) What are the differences between abstract class and interface?
  
                Abstract class	                                         Interface
    1.  An abstract class can have a method body (non-abstract        The interface has only abstract methods.
        methods).	
     
     2. An abstract class can have instance variables.	               An interface cannot have instance variables.
     
        An abstract class can have the constructor.	                   The interface cannot have the constructor.
     
     3. An abstract class can have static methods.	                   The interface cannot have static methods.
     
     4. You can extend one abstract class.	                           You can implement multiple interfaces.
     
     5. The abstract class can provide the implementation              The Interface can't provide the implementation of the 
        of the interface.	                                           abstract class.
     
     6. The abstract keyword is used to declare an abstract class.	   The interface keyword is used to declare an interface.
     
    7.  An abstract class can extend another Java class and            An interface can extend another Java interface only.
       implement multiple Java interfaces.	
      
     8. An abstract class can be extended using keyword extends	      An interface class can be implemented using keyword 
                                                                      implements
                                                                      
    9. A Java abstract class can have class members like               Members of a Java interface are public by default.
     private, protected, etc.	
     Example:
      public abstract class Shape{                                       public interface Drawable{
           public abstract void draw();                                          void draw();
                      }                                                             }
                         }
  
  4)  What is the nested interface?
      An Interface that is declared inside the interface or class is known as the nested interface. It is static by default. 
      The nested interfaces are used to group related interfaces so that they can be easy to maintain. The external interface 
      or class must refer to the nested interface. It can't be accessed directly. The nested interface must be public if it is 
      declared inside the interface but it can have any access modifier if declared within the class. The syntax of the nested 
      interface is given as follows.
      
  5)  What is Garbage Collection?
      Garbage collection is a process of reclaiming the unused runtime objects. It is performed for memory management. In 
      other words, we can say that It is the process of removing unused objects from the memory to free up space and make this
       space available for Java Virtual Machine. Due to garbage collection java gives 0 as output to a variable whose value is 
       not set, i.e., the variable has been defined but not initialized. For this purpose, we were using free() function in 
       the C language and delete() in C++. In Java, it is performed automatically. So, java provides better memory management.

  6)  How is garbage collection controlled?
      Garbage collection is managed by JVM. It is performed when there is not enough space in the memory and memory is running
       low. We can externally call the System.gc() for the garbage collection. However, it depends upon the JVM whether to 
       perform it or not.
       
  7)  What is the difference between final, finally and finalize?
        	final		
      Final is a keyword. Final is used to apply restrictions on class, method, and variable. The final class can't be inherited, final method 
      can't be overridden, and final variable value can't be changed.	

      finally
      Finally is a block. Finally is used to place important code, it will be executed whether an exception is handled or not.	
    
      finalize
      Finalize is a method. Finalize is used to perform clean up processing just before an object is garbage collected.
			
*/
interface Banks {
	float rateofintrest();
	
	int a=10, b=20;
	default void msg(int a, int b)
	{
		int c=a+b;
		System.out.println("welcome to hyd");
	}
	
	static void dfr()
	{
		System.out.println("welcome to hyd");
	}
	
	static interface khaja
	{
		void mj();
	}
	
	

}

class Statebank implements Banks {
	public float rateofintrest() {
		return 10.6f;
	}
	
	

}

class Andhrabank implements Banks {
	public float rateofintrest() {
		return 2.9f;
	}
}

public class Interfaceses {

	public static void main(String[] args) {

		Banks b = new Statebank();
		System.out.println(b.rateofintrest());

		Banks b1 = new Andhrabank();
		System.out.println(b1.rateofintrest());

	}

}
