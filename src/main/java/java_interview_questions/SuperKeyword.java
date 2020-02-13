package java_interview_questions;


    /*
     * The super keyword is a reference variable which is used to refer immediate parent class object.

       Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by 
       super reference variable.
       
  1) Usage of Java super Keyword:-
     super can be used to refer immediate parent class instance variable.
     super can be used to invoke immediate parent class method.
     super() can be used to invoke immediate parent class constructor. 
     
  2) super is used to refer immediate parent class instance variable.
     We can use super keyword to access the data member or field of parent class. It is used if parent class and child 
     class have same fields.
     
  3) super can be used to invoke parent class method
     The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same
      method as parent class. In other words, it is used if method is overridden.
     
 4) super is used to invoke parent class constructor.
    The super keyword can also be used to invoke the parent class constructor. 

*
*/

class A1{
	int id;
	String name;
	String color="White";
	
	A1(int id, String name)
	{
		this.id=id;
		this.name=name;
		System.out.println("Welcome to parant class constractor");
	}
	void message()
	{
		System.out.println("Welcome to Chennai");
	}
}

class D1 extends A1{
	
	float salary;
	D1(int id, String name, float salary)
	{
		super(id, name);
		this.salary=salary;
		
		//System.out.println("Welcome to sub calss constractor");
		
	}
	@Override
	void message() {
		super.message();
		
		System.out.println(id+" "+name+" "+salary);
		//System.out.println("Welcome to Hyderabad");
	}
	
	void display()
	{
		super.message();
	}
	String color="black";
	
	void printcolor()
	{
		System.out.println(color);
		System.out.println(super.color);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		D1 d=new D1(111, "khaja", 2365f);
		d.printcolor();
		d.display();
		d.message();
		

	}

}
