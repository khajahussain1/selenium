package java_interview_questions;


   /*
    * constructor is a block of codes similar to the method. It is called when an instance of the object is created, 
    * and memory is allocated for the object.

      It is a special type of method which is used to initialize the object.
      
  1)  When is a constructor called
      Every time an object is created using new() keyword, at least one constructor is called. It calls a default 
      constructor.

  Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary 
       to write a constructor for a class. It is because java compiler creates a default constructor if your class 
       doesn't have any.
      
  2)  Rules for creating Java constructor:-
      Constructor name must be the same as its class name
      A Constructor must have no explicit return type
      A Java constructor cannot be abstract, static, final, and synchronized
      
  Note: We can use access modifiers while declaring a constructor. It controls the object creation.  we can have 
        private, protected, public or default constructor in Java.
        
   3)  Types of Java constructors:- 
       There are two types of constructors in Java:
       Default constructor (no-arg constructor)
       Parameterized constructor
       
  4)  Default Constructor
      A constructor is called "Default Constructor" when it doesn't have any parameter.
  Note:- Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
      
  Q) What is the purpose of a default constructor?
    The default constructor is used to provide the default values to the object like 0, null, etc., depending on the 
    type.


  5)  Parameterized Constructor:-
      A constructor which has a specific number of parameters is called a parameterized constructor.

  Q)  Why use the parameterized constructor?
      The parameterized constructor is used to provide different values to the distinct objects. However, you can 
      provide  the same values also.
       
  6)  Constructor Overloading in Java
      a constructor is just like a method but without return type. It can also be overloaded like Java methods.

      Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
      They are arranged in a way that each constructor performs a different task. They are differentiated by the 
      compiler by the number of parameters in the list and their types.
      
      
  7)  Difference between constructor and method in Java

      Constructor	                                                Method
      
      A constructor is used to initialize the state of an object.	A method is used to expose the behavior of an object.
      A constructor must not have a return type.	                A method must have a return type.
      The constructor is invoked implicitly.	                    The method is invoked explicitly.
      The Java compiler provides a default constructor              The method is not provided by the compiler in any case.
      if you don't have any constructor in a class.	
      The constructor name must be same as the class name.	        The method name may or may not be same as class name.
      
  Q) Does constructor return any value?
     Yes, it is the current class instance (You cannot use return type yet it returns a value).
     
 Q)  Can constructor perform other tasks instead of initialization?
     Yes, like object creation, starting a thread, calling a method, etc. You can perform any operation in the constructor 
     as you perform in the method.
   
*
*/

public class Constactor {
	
	private int id;
	String name;
	int age;
	
	private Constactor(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public Constactor(int id, String name, int age)
	{
		this(id, name);
		//this.id=id;
//		this.name=name;
		this.age=age;
	}
	
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	
	public static void main(String[] args) {

		Constactor c=new Constactor(112, "kjdf");
		Constactor c1=new Constactor(11, "jdf", 25);
		c.display();
		c1.display();
	}

}
