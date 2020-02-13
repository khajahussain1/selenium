package java_interview_questions;

class Parentclass{

	public void mymethod()
	{
		System.out.println("parent method is working");
	}
	
}

public class Overriding extends Parentclass {
	
	public void mymethod()
	{
		//super.mymethod();
		System.out.println("Child method is working");
	}
	
	public void work()
	{
		super.mymethod();
	}
	
	public static void main(String[] args) {
		
		/* When parent class reference refers to the child class object
		 * then the method of the child class (overriding method) is called.
		 * This we call as runtime polymorphism
		 */
		Parentclass ch = new Overriding();
		ch.mymethod();
		//ch.work();
				
		 /* When Parent class reference refers to the parent class object
		 * then the method of parent class (overriden method) is called.
		 */
		Parentclass pa = new Parentclass();
		
		pa.mymethod();
	}

}
