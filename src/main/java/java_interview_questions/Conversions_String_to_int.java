package java_interview_questions;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class Conversions_String_to_int

{
	@Test(groups = {"sanity", "regresion", "critical"})
	public void Convert_int_to_String() {

		// method-1
		int x = 250;

		String s1 = Integer.toString(x);

		System.out.println(s1);

		// method-2

		String s2 = String.valueOf(x);

		System.out.println(s2);

		// method-3

		String s3 = String.format("%d", x);

		System.out.println(s3);
	}

	 @Test(groups = {"sanity", "regresion"})
	public void Convert_String_to_Integer() {

		// method-1

		String str = "200";

		int i1 = Integer.parseInt(str);

		System.out.println(i1);

		// method-2

		int i2 = Integer.valueOf(str);

		System.out.println(i2);

		// method-3--number format exception

		String s = "khajahussain";

		int i3 = Integer.parseInt(s);

		System.out.println(i3);
	}

	 @Test(groups = {"regresion", "critical"})
	public void Convert_String_to_Long() {
		 
		String s = "9290543618";

		long l = Long.parseLong(s);

		System.out.println(l);

	}

	// @Test
	public void Convert_Long_to_String() {
		long l = 9290543618L;

		String s = String.valueOf(l);
		String s1=Long.toString(l);
		

		System.out.println(s);
	}

	// @Test
	public void Convert_String_to_float() {
		String s = "23.6";

		float f = Float.parseFloat(s);

		System.out.println(f);
	}

	// @Test
	public void Convert_float_to_String() {
		float f = 89.7F;
		String s = Float.toString(f);
		System.out.println(s);
	}

	// @Test
	public void Convert_Strinig_to_double() {
		String s = "23.6";
		double d = Double.parseDouble("23.6");
		System.out.println(d);
	}

	// @Test
	public void Convert_double_to_String() {
		double d = 89.7;
		String s = Double.toString(d);
		String s1=String.valueOf(d);
		System.out.println(s);
	}

	// @Test
	public void Convert_String_to_Date() throws ParseException {
		String s = "31-12-1998";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		Date d = formatter.parse(s);
		System.out.println(s + "\t" + d);
	}

	// @Test
	public void Convert_Date_to_String() {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy_mm_dd-hh-mm-ss");
		String time = formatter.format(d);
		System.out.println(time);
	}

	// @Test
	public void Convert_String_to_Char() {
		String s = "hello";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			System.out.println("char at " + i + " index is: " + c);
		}

	}

	// @Test
	public void Convert_Char_to_String() {
		char c = 'M';
		String s = Character.toString(c);
		String s1=String.valueOf(c);
		System.out.println("String is: " + s);

	}

	// @Test
	public void Convert_String_to_Object() {
		String s = "hello";
		Object obj = s;
		System.out.println(obj);

	}

	// @Test
	public void Convert_Object_to_String() {
		Conversions_String_to_int e = new Conversions_String_to_int();
		String s = e.toString();
		String s2 = String.valueOf(e);
		System.out.println(s);
		System.out.println(s2);

	}

	//@Test
	public void polydrom_string_method_1() {

		String s = "nitin";
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String rev = sb.toString();// converting StringBuilder to String
		if (s.equals(rev)) {
			System.out.println("Palindrome String");
		} else {
			System.out.println("Not Palindrome String");
		}
	}
	
	
	//@Test
		public void polydrom_string_method_2() {

			String s = "nitin";
			String a[]=s.split("");
			String rev="";
			for(int i=s.length()-1; i>=0; i--)
			{
				rev=rev+a[i];
				
			}
			
			if(s.equals(rev))
			{
				System.out.println(s+" is a polymdrom sytring");
				
			}
			else
			{
				System.out.println(s+" is not  polymdrom string");
			}
		}
}
