package java_interview_questions;

import org.testng.annotations.Test;

public class String_Stringbuffer_Stringbuilder {

	/*
	 * A string that can be modified or changed is known as mutable string.
	 * StringBuffer and StringBuilder classes are used for creating mutable string.
	 * 
	 * 1. String:- String objects are immutable--> If the content is fixed and won't
	 * change frequently then we should go for String. 
	 * 2. String buffer objects are mutable :- If content is not fixed and keep on changing but thread safety is
	 * required (one thread execute at a time) then we should go for String buffer.
	 * 3. String builder objects are mutable :- If content is not fixed and keep on
	 * changing but thread safety is not required (multiple threads executes at a
	 * time) then we go for string builder.
	 */

	/*
	 * Java StringBuffer class is used to create mutable (modifiable) string. The
	 * StringBuffer class in java is same as String class except it is mutable i.e.
	 * it can be changed. 1. String :- Once we create a string object we can't
	 * perform any changes in the exesting object. If we are trying to perform any
	 * changes with those changes a new object will be created this non changable
	 * nature nothing but immutability of the string object. 2. String buffer:- Once
	 * we create a string buffer object we can perform any type of changes in the
	 * exesting object. This changeble is nothing but mutability of the string
	 * buffer object.
	 * 
  1)  What do you understand by an IO stream?
      The stream is a sequence of data that flows from source to destination. It is composed of bytes. In Java, three streams 
      are created for us automatically.

      System.out: standard output stream
      System.in: standard input stream
      System.err: standard error stream
      
   2) What is the difference between the Reader/Writer class hierarchy and the InputStream/OutputStream class hierarchy?
      The Reader/Writer class hierarchy is character-oriented, and the InputStream/OutputStream class hierarchy is 
      byte-oriented. The ByteStream classes are used to perform input-output of 8-bit bytes whereas the CharacterStream 
      classes are used to perform the input/output for the 16-bit Unicode system. There are many classes in the ByteStream 
      class hierarchy, but the most frequently used classes are FileInputStream and FileOutputStream. The most frequently used 
      classes CharacterStream class hierarchy is FileReader and FileWriter.
      
   3) What are the FileInputStream and FileOutputStream?
      Java FileOutputStream is an output stream used for writing data to a file. If you have some primitive values to write 
      into a file, use FileOutputStream class. You can write byte-oriented as well as character-oriented data through the 
      FileOutputStream class. However, for character-oriented data, it is preferred to use FileWriter than FileOutputStream. 
      Consider the following example of writing a byte into a file.
      
      Java FileInputStream class obtains input bytes from a file. It is used for reading byte-oriented data (streams of raw 
      bytes) such as image data, audio, video, etc. You can also read character-stream data. However, for reading streams of 
      characters, it is recommended to use FileReader class. Consider the following example for reading bytes from a file.
	 */
	@Test
	public void String() {
		String s = new String("khaja");
		s.concat("hussain");
		System.out.println(s);

		/* out put is khaja only not khaja hussain */
	}
	
	/*how to create immutable class*/
	
	/*The above class is immutable because:

		The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
		The class is final so we cannot create the subclass.
		There is no setter methods i.e. we have no option to change the value of the instance variable.
	*/
	/*public final class Employee{  
		final String pancardNumber;  
		  
		public Employee(String pancardNumber){  
		this.pancardNumber=pancardNumber;  
		}  
		  
		public String getPancardNumber(){  
		return pancardNumber;  
		}  
		  
		}  
*/
	/* StringBuffer methods */

	@Test
	public void append() {
		/* The append() method concatenates the given argument with this string. */

		StringBuffer sb = new StringBuffer("Hello ");
		sb.append("Java");// now original string is changed
		System.out.println(sb);// prints Hello Java

	}

	@Test
	public void insert() {
		/*
		 * The insert() method inserts the given string with this string at the given
		 * position.
		 */

		StringBuffer sb = new StringBuffer("Hello ");
		sb.insert(1, "Java");// now original string is changed
		System.out.println(sb);// prints HJavaello

	}

	@Test
	public void replace() {
		/*
		 * The replace() method replaces the given string from the specified beginIndex
		 * and endIndex.
		 */

		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(1, 3, "Java");
		System.out.println(sb);// prints HJavalo

	}

	@Test
	public void delete() {
		/*
		 * The delete() method of StringBuffer class deletes the string from the
		 * specified beginIndex to endIndex.
		 */

		StringBuffer sb = new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb);// prints Hlo

	}

	@Test
	public void reverse() {
		/* The reverse() method of StringBuilder class reverses the current string. */

		StringBuffer sb = new StringBuffer("Hello");
		sb.reverse();
		System.out.println(sb);// prints olleH

	}

	@Test
	public void capacity() {
		/*
		 * The capacity() method of StringBuffer class returns the current capacity of
		 * the buffer. The default capacity of the buffer is 16. If the number of
		 * character increases from its current capacity, it increases the capacity by
		 * (oldcapacity*2)+2. For example if your current capacity is 16, it will be
		 * (16*2)+2=34.
		 */

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2

	}

	@Test
	public void ensureCapacity() {
		/*
		 * The ensureCapacity() method of StringBuffer class ensures that the given
		 * capacity is the minimum to the current capacity. If it is greater than the
		 * current capacity, it increases the capacity by (oldcapacity*2)+2. For example
		 * if your current capacity is 16, it will be (16*2)+2=34.
		 */

		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());// default 16
		sb.append("Hello");
		System.out.println(sb.capacity());// now 16
		sb.append("java is my favourite language");
		System.out.println(sb.capacity());// now (16*2)+2=34 i.e (oldcapacity*2)+2
		sb.ensureCapacity(10);// now no change
		System.out.println(sb.capacity());// now 34
		sb.ensureCapacity(50);// now (34*2)+2
		System.out.println(sb.capacity());// now 70

	}
}
