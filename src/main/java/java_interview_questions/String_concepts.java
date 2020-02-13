package java_interview_questions;

import org.testng.annotations.Test;


/*
 * A part of string is called substring. In other words, substring is a subset
 * of another string. In case of substring startIndex is inclusive and endIndex
 * is exclusive.
 * 
 * You can get substring from the given string object by one of the two methods:
 * 
1 public String substring(int startIndex): 
 * This method returns new String object containing the substring of the given string from specified startIndex
 * (inclusive).
2. public String substring(int startIndex, int endIndex): 
 *  This method returns new String object containing the substring of the given string
 * from specified startIndex to endIndex.
 * 
 * In case of string:
 * 
 * startIndex: inclusive 
 * endIndex: exclusive
 * 
 * Let's understand the startIndex and endIndex by the code given below.
 * 
 * String s="hello"; 
 * System.out.println(s.substring(0,2));//he
 * 
 * 
 *  1) What is String Pool?
       String pool is the space reserved in the heap memory that can be used to store the strings. The main advantage of using
       the String pool is whenever we create a string literal; the JVM checks the "string constant pool" first. If the string 
       already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, 
       a new string instance is created and placed in the pool. Therefore, it saves the memory by avoiding the duplicacy.
   
    2) Why are the objects immutable in java?
       Because Java uses the concept of the string literal. Suppose there are five reference variables, all refer to one 
       object "sachin". If one reference variable changes the value of the object, it will be affected by all the reference
       variables. That is why string objects are immutable in java.
       
    3) How many ways can we create the string object?
       1) String Literal
       Java String literal is created by using double quotes. For Example:

       String s="welcome";  
       Each time you create a string literal, the JVM checks the "string constant pool" first. If the string already exists 
       in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string 
       instance is created and placed in the pool. String objects are stored in a special memory area known as the string 
       constant pool For example:

       String s1="Welcome";  
       String s2="Welcome";//It doesn't create a new instance  
       
       2) By new keyword
       String s=new String("Welcome");//creates two objects and one reference variable  
       In such case, JVM will create a new string object in normal (non-pool) heap memory, and the literal "Welcome" will be 
       placed in the constant string pool. The variable s will refer to the object in a heap (non-pool).
       
   4) How many objects will be created in the following code?
      String s1="Welcome";  
      String s2="Welcome";  
      String s3="Welcome";  
      Only one object will be created using the above code because strings in Java are immutable.
      
  5) How many objects will be created in the following code?
     String s = new String("Welcome");  
     Two objects, one in string constant pool and other in non-pool(heap).
     
  6) What are the differences between String and StringBuffer?

        	String	                                          StringBuffer
     The String class is immutable.	                          The StringBuffer class is mutable.
	 The String is slow and consumes more memory when you     The StringBuffer is fast and consumes less memory when you 
	 concat too many strings because every time it creates    cancat strings.
	 a new instance.	
	 The String class overrides the equals() method of        The StringBuffer class doesn't override the equals() method of 
	 Object class. So you can compare the contents of two     Object class.
	 strings by equals() method.	
	 
  7) What are the differences between StringBuffer and StringBuilder?

        	StringBuffer	                                    StringBuilder
     StringBuffer is synchronized, i.e., thread safe.           StringBuilder is non-synchronized,i.e., not thread safe. 
     It means two threads can't call the methods of             It means two threads can call the methods of StringBuilder 
     StringBuffer simultaneously.	                            simultaneously.
     StringBuffer is less efficient than StringBuilder.	        StringBuilder is more efficient than StringBuffer.
     
 8)  How can we create an immutable class in Java?
     We can create an immutable class by defining a final class having all of its members as final. 

     public final class Employee{  
       final String pancardNumber;  
  
       public Employee(String pancardNumber){  
         this.pancardNumber=pancardNumber;  
                 }  
  
       public String getPancardNumber(){  
            return pancardNumber;  
                        }  
  
                }  
                
  9)  What is the purpose of toString() method in Java?
      The toString() method returns the string representation of an object. If you print any object, java compiler internally
      invokes the toString() method on the object. So overriding the toString() method, returns the desired output, it can 
      be the state of an object, etc. depending upon your implementation. By overriding the toString() method of the Object 
      class, we can return the values of the object, so we don't need to write much code. Consider the following example.
      
      class Student{  
        int rollno;  
        String name;  
        String city;  
  
      Student(int rollno, String name, String city){  
        this.rollno=rollno;  
        this.name=name;  
         this.city=city;  
                }  
   
        public String toString(){//overriding the toString() method  
           return rollno+" "+name+" "+city;  
             }  
      public static void main(String args[]){  
        Student s1=new Student(101,"Raj","lucknow");  
         Student s2=new Student(102,"Vijay","ghaziabad");  
     
        System.out.println(s1);//compiler writes here s1.toString()  
        System.out.println(s2);//compiler writes here s2.toString()  
                                     }  
                       }  
                       
  10)  What are the advantages of Java inner classes?
       There are two types of advantages of Java inner classes.

       Nested classes represent a special type of relationship that is it can access all the members (data members and methods)
       of the outer class including private.
       Nested classes are used to develop a more readable and maintainable code because it logically groups classes and 
       interfaces in one place only.
       Code Optimization: It requires less code to write.
       
  11)  What is a nested class?
       The nested class can be defined as the class which is defined inside another class or interface. We use the nested 
       class to logically group classes and interfaces in one place so that it can be more readable and maintainable. A nested 
       class can access all the data members of the outer class including private data members and methods. The syntax of the
       nested class is defined below.

       class Java_Outer_class{    
         //code    
       class Java_Nested_class{    
            //code    
                     }    
           }    
  
   Note:- There are two types of nested classes, static nested class, and non-static nested class. The non-static nested 
          class can also be called as inner-class
          
  12)  What are the disadvantages of using inner classes?

      Inner classes increase the total number of classes used by the developer and therefore increases the workload of JVM 
      since it has to perform some routine operations for those extra classes which result in slower performance.
      IDEs provide less support to the inner classes as compare to the top level classes and therefore it annoys the 
      developers while working with inner classes.

 */

public class String_concepts

{
	
	// @Test
	public void sub_string() {
		String s = "hello";
		System.out.println(s.substring(0, 2));// he
	}

	// @Test
	public void substring() {
		String s = "SachinTendulkar";
		System.out.println(s.substring(6));// Tendulkar
		System.out.println(s.substring(0, 6));// Sachin
	}

	// @Test
	public void swap_two_numbers() {
		int x = 10, y = 20;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x value is : " + x + " and " + " y values is :" + y);

	}

	// @Test
	public void swaping_two_strings() {
		String x = "khaja";
		String y = "Hussain";

		x = x + y;
		y = x.substring(0, (x.length() - y.length()));
		x = x.substring(y.length());

		System.out.println(x);
		System.out.println(y);
	}

	// @Test
	public void trim() {
		/* The string trim() method eliminates white spaces before and after string. */
		String s = "  Khaja  ";
		System.out.println(s);// Sachin
		System.out.println(s.trim());// Sachin
	}

	// @Test
	public void startsWith_and_endsWith() {
		String s = "Sachin";
		System.out.println(s.startsWith("Sa"));// true
		System.out.println(s.endsWith("in"));// true

	}

	// @Test
	public void charAt() {
		/* The string charAt() method returns a character at specified index. */
		String s = "Sachin";
		System.out.println(s.charAt(0));// S
		System.out.println(s.charAt(3));// h

	}

	// @Test
	public void oUpperCase_and_toLowerCase() {
		/*
		 * The java string toUpperCase() method converts this string into uppercase
		 * letter and string toLowerCase() method into lowercase letter.
		 */
		String s = "Sachin";
		System.out.println(s.toUpperCase());// SACHIN
		System.out.println(s.toLowerCase());// sachin
		System.out.println(s);// Sachin(no change in original)

	}

	// @Test
	public void valueOf() {
		/*
		 * The string valueOf() method coverts given type such as int, long, float,
		 * double, boolean, char and char array into string.
		 * 
		 */
		int a = 10;
		String s = String.valueOf(a);
		System.out.println(s + 10);

	}

	@Test
	public void replace() {
		/*
		 * The string replace() method replaces all occurrence of first sequence of
		 * character with second sequence of character.
		 * 
		 */
		String s1 = "Java is a programming language. Java is a platform. Java is an Island.";
		String replaceString = s1.replace("Java", "Khaja");// replaces all occurrences of "Java" to "Kava"
		System.out.println(replaceString);

	}
	
 
		   
}
