package java_interview_questions;

   /*

     one object acquires all the properties and behaviors of a parent object. 

     you can create new classes that are built upon existing classes. When you inherit from an existing class, you can
     reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class 
     also.

     Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
     
  Q)  Why use inheritance in java:- 
      For Method Overriding (so runtime polymorphism can be achieved).
      For Code Reusability.
  
  1)  Terms used in Inheritance:-
      Class: A class is a group of objects which have common properties. It is a template or blueprint from which objects 
      are  created.
      
      Sub Class/Child Class: Subclass is a class which inherits the other class. It is also called a derived class, extended 
      class, or child class.
      
      Super Class/Parent Class: Superclass is the class from where a subclass inherits the features. It is also called a base
      class or a parent class.
      
      Reusability: As the name specifies, reusability is a mechanism which facilitates you to reuse the fields and methods of 
      the existing class when you create a new class. You can use the same fields and methods already defined in the previous 
      class.
       
   2)  Types of inheritance in java:-
       there can be three types of inheritance in java: single, multilevel and hierarchical.

       In java programming, multiple and hybrid inheritance is supported through interface only. 
       
  Note: Multiple inheritance is not supported in Java through class.
  
  Q)   Why multiple inheritance is not supported in java?
       To reduce the complexity and simplify the language, multiple inheritance is not supported in java.

       Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have 
       the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.

       Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. 
       So whether you have same method or different, there will be compile time error.
       
  3)  Aggregation in Java:-
      If a class have an entity reference, it is known as Aggregation. Aggregation represents HAS-A relationship.

      Consider a situation, Employee object contains many informations such as id, name, emailId etc. It contains one more 
      object named address, which contains its own informations such as city, state, country, zipcode etc. 
      
  Q)  Why use Aggregation?
      For Code Reusability.
      
  4)  When use Aggregation?
      Code reuse is also best achieved by aggregation when there is no IS-A relationship.
      Inheritance should be used only if the relationship IS-A is maintained throughout the lifetime of the objects involved; 
      otherwise, aggregation is the best choice.

*
*/



class Address {
	
	String city, state, country;

	public Address(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

}

public class Inheritance 
{
	int id;
	String name;
	Address address;

	public Inheritance(int id, String name,Address address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}

	void display() {
		System.out.println(id + " " + name);
		System.out.println(address.city + " " + address.state + " " + address.country);
	}

	public static void main(String[] args) {
		Address address1 = new Address("gzb", "UP", "india");
		Address address2 = new Address("gno", "UP", "india");

		Inheritance e = new Inheritance(111, "varun", address1);
		Inheritance e2 = new Inheritance(112, "arun", address2);

		e.display();
		e2.display();

	}

}
