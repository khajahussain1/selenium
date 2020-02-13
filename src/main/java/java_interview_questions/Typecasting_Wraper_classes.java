package java_interview_questions;

import org.testng.annotations.Test;

public class Typecasting_Wraper_classes {
	/*
	 * Auto Widening byte < short < int < long < float < double
	 * 
	 * When you are converting data from small sized data type to big sized data
	 * type, i.e when you are converting data from left-placed data type to
	 * right-placed data type in the above order, auto widening will be used.
	 */
	@Test
	public void Auto_Widening() {
		byte b = 25;

		short s = b; // byte is auto widened to short

		int i = s; // short is auto widened to int

		long l = i; // int is auto widened to long

		float f = l; // long is auto widened to float

		System.out.println(f);

		double d = f; // float is auto widened to double

		System.out.println(d);
	}

	/*
	 * Explicit Narrowing byte < short < int < long < float < double
	 * 
	 * When you are converting data from big sized data type to small sized data
	 * type, i.e when you are converting data from right-placed data type to
	 * left-placed data type in the above order, explicit narrowing will be used.
	 */
	
	/*
	 * These are data types with no decimal places.
	 * 
	 * 1) byte 2) short 3) int 4) long
	 * 
	 * and these are data types with decimal places.
	 * 
	 * 5) float 6) double
	 * 
	 * When you put them in the increasing order of their memory size, you get
	 * 
	 * byte < short < int < long < float < double
	 */
	@Test
	public void Explicit_Narrowing() {
		double d = 10.25;

		float f = (float) d; // double is explicitly narrowed to float

		long l = (long) f; // float is explicitly narrowed to long

		int i = (int) l; // long is explicitly narrowed to int

		short s = (short) i; // int is explicitly narrowed to short

		byte b = (byte) s; // short is explicitly narrowed to byte
		System.out.println(b);
	}
	
	/*Wrapper class in Java
	Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.

	Since J2SE 5.0, autoboxing and unboxing feature converts primitive into object and object into primitive automatically. 
	The automatic conversion of primitive into object is known as autoboxing and vice-versa unboxing.
*/
	
   /*Primitive Type	Wrapper class
	boolean     	Boolean
	char	        Character
	byte	        Byte
	short	        Short
	int	            Integer
	long        	Long
	float       	Float
	double	        Double*/
	
	@Test
	public void Primitive_to_Wrapper()
	{
		//Converting int into Integer  
		int a=20;  
		Integer i=Integer.valueOf(a);//converting int into Integer  
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally  
		  
		System.out.println(a+" "+i+" "+j);  
	}
	
	@Test
	public void Wrapper_to_Primitive()
	{
		//Converting Integer to int    
		Integer a=new Integer(3);    
		int i=a.intValue();//converting Integer to int  
		int j=a;//unboxing, now compiler will write a.intValue() internally    
		    
		System.out.println(a+" "+i+" "+j);  
	}
}

