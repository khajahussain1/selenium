package java_interview_questions;



   /*1. To design a singleton class:

     Ans:-  1. Make constructor as private.
      2. Write a static method that has return type object of this singleton class. 
      Here, the concept of Lazy initialization in used to write this static method.
      
      *Normal class vs Singleton class: Difference in normal and singleton class in terms of instantiation is that, 
      *For normal class we use constructor, whereas for singleton class we use getInstance() method (Example code:I). 
      *In general, to avoid confusion we may also use the class name as method name while defining this method
      *
      *
      *2. What is a Singleton class?
      *Ans:- We can’t have more than a single object for such classes.
      *  Singleton classes are employed extensively in concepts like Networking and Database Connectivity.
      */

public class SingletonClass {
	
	// static variable SingletonClass of type singletonclass
	private static SingletonClass singletonclass =null;
	private static SingletonClass SingletonClass;
	
	// variable of type String
	public String s;
	
	 // private constructor restricted to this class itself
	private SingletonClass()
	{
		s = "Hello I am a string part of Singleton class"; 
    } 
	
	// static method to create instance of Singleton class
	public static SingletonClass getInstance()
	{
		if(singletonclass==null)
		{
			singletonclass = new SingletonClass();
		}
		
		return singletonclass;
	}
	
	public static SingletonClass SingletonClass()
	{
		if(SingletonClass==null)
		{
			SingletonClass = new SingletonClass();
		}
		
		return SingletonClass;
	}

}

