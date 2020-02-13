package java_interview_questions;



   /*

  1) What is the abstraction?
     Abstraction is a process of hiding the implementation details and showing only functionality to the user. It displays 
     just the essential things to the user and hides the internal information,
      
     for example, sending SMS where you type the text and send the message. You don't know the internal processing about
     the message delivery. Abstraction enables you to focus  on what the object does instead of how it does it. 
     Abstraction lets you focus on what the object does instead of how it  does it.

     In Java, there are two ways to achieve the abstraction.
     Abstract Class
     Interface
     
* 2) What is the difference between abstraction and encapsulation?
     Abstraction hides the implementation details whereas encapsulation wraps code and data into a single unit.
     
     
   3) How to make a read-only class in Java?
     A class can be made read-only by making all of the fields private. The read-only class will have only getter methods 
     which return the private property of the class to the main method. We cannot modify this property because there is no 
     setter method available in the class. 
     
     	//A Java class which has only getter methods.    
       public class Student{    
         //private data member    
       private String college="AKG";    
        //getter method for college    
       public String getCollege(){    
           return college;    
                        }    
                    }  
                    
   4) How to make a write-only class in Java?
      A class can be made write-only by making all of the fields private. The write-only class will have only setter methods 
      which set the value passed from the main method to the private fields. We cannot read the properties of the class 
      because there is no getter method in this class. Consider the following example.
      
        /A Java class which has only setter methods.    
       public class Student{    
         //private data member    
       private String college;    
         //getter method for college    
       public void setCollege(String college){    
           this.college=college;    
                    }    
              }      
*
*  5) What are the advantages of Encapsulation in Java?

      By providing only the setter or getter method, you can make the class read-only or write-only. In other words, you can 
      skip the getter or setter methods.
      It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only,
      you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter
       methods.
      It is a way to achieve data hiding in Java because other class will not be able to access the data through the private 
      data members.
      The encapsulate class is easy to test. So, it is better for unit testing.
      The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create 
      an encapsulated class in Java. 
      
      
      Abstact class Points to remember:

     1. Abstract classes may or may not include abstract methods
     2. If a class is declared abstract then it cannot be instantiated.
     3. If a class has abstract method then we have to declare the class as abstract class
     4. When an abstract class is sub classed, the subclass usually provides implementations for all of the abstract methods 
     in its parent class. However, if it does not, then the subclass must also be declared abstract.
      
      Interface Points to remember:

      1. Java interface represents IS-A relationship similar to Inheritance
      2. Interface cannot be instantiated same like abstract class
      3. Java compiler adds public, default, static and abstract keywords before the interface methods
      4. Java compiler adds public, static and final keywords before data members
      5. Interface extends another interface just like a Class extends another Class but a class implements an interface.
      6. The class that implements interface must implement all the methods of that interface.
      7. Java allows you to implement more than one interface in a Class
*
*/
interface A {
	
	public void a();

	abstract void b();

	 void c();

	void d();

	public String name = "khaja";
	
	static int age = 20;
	
	final int a = 10, b = 20;
	

	default void add() {
		System.out.println(a + b);
	}

	public static void man() {
		System.out.println(b + a);
	}
	
	
}

abstract class B   {
	/*public void c() {
		System.out.println(a + b);
	}*/
	
	final void mj()
	{
		System.out.println("ssdd");
	}
	private void msg()
	{
		System.out.println("khaja");
	}
	
	static void khaja()
	{
		System.out.println("Welcome to hyd");
	}
	
	
}

class M extends B {
	/*public void a() {
		System.out.println("a is a method" + (b + a));
	}*/

	public void b() {
		System.out.println("b is a method");
	}

	public void d() {
		System.out.println("d is a method");
	}
}

public class Abstraction_and_Encapsulation {

	public static void main(String[] args) {

		//A m = new M();
		B b= new M();
	/*	m.a();
		m.b();
		m.c();
		m.d();
		m.add();*/
		A.man();
		b.mj();
		B.khaja();
		
		
	}

}
