package java_interview_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ArraysExamples {

	public static int[] a = { 73, 13, 342, 8, 963, 63, 54 };
	
	//@Test
	public void reverse_the_words_and_charectors() {
		
		String str = "khaja hussain is a software engineer";
		
		String a[] = str.split(" ");
		
		for(int i=a.length-1; i>=0; i--)
		{
			//System.out.print(a[i]+" ");
			
			String st = a[i];
			
			String s[]=st.split("");
			
			for(int j=s.length-1; j>=0; j--)
			{
				System.out.print(s[j]);
			}
			System.out.print(" ");
			
		}
	}
	
	
	@Test
	public static void polymdrom_string() {
		String str = "nitin";
		String a[]=str.split("");
		String rev="";
		
		for(int i=a.length-1; i>=0; i--)
		{
			rev=rev+a[i];
			
		}
		if(str.equals(rev))
		{
			System.out.println("Given string is polymdrom"); 
		
		}else
		{
			System.out.println("Gien string is not polymdrom");
		}
		
	}
	
	//@Test
	public void convert_hashmap_Arraylist()
	{
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "khaja");
		m.put("2", "vali");
		Set<Entry<String, String>> s = m.entrySet();
		List<Entry<String, String>> al = new ArrayList<Entry<String, String>>(s);
		System.out.println(al);
	}
	
	//@Test
	public static void Count_duplicate_Numbers_In_Array() {

		// int[] a = { 355, 655, 677, 3667 };

		// int a=345436543;

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < a.length; i++) {

			// char[] charr = String.valueOf(a[i]).toCharArray();
			char charr[] = Integer.toString(a[i]).toCharArray();

			for (int j = 0; j < charr.length; j++) {

				if (hm.containsKey(charr[j])) {

					hm.put(charr[j], hm.get(charr[j]) + 1);

				} else {

					hm.put(charr[j], 1);
				}
			}
		}
		System.out.println(hm);

	}

	// @Test
	public static void sum_of_the_digits() {
		
		int n = 325;
		int sum = 0, r;

		while (n > 0)
		{
			r = n % 10;
			sum = sum + r;
			n = n / 10;

		}

		System.out.println("sum of thd digits is " + sum);
	}

	// @Test
	public static void diapsy_Dashesh_AsSquare() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	// @Test
	public static void sortNumbers_InAn_Array() {
		
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length; j++) {
				
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Sorted array values are :	");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	// @Test
	public static void toal_no_of_an_array() {

		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		System.out.println("Sum of all the elements in an array is  : " + total);
	}

	// @Test
	public static void getAverage_ValueOf_AnArray_Elelents() {
		int arrayCount = a.length;
		double average = 0.00;
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
			average = total / arrayCount;
		}
		System.out.println("Array values average is :" + average);
	}

	// @Test
	public static void searchAnElement() {

		int searchElement = 342;
		boolean foundElement = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchElement) {
				foundElement = true;
				System.out.println("Element is exist in the array in " + i + " index place");
				break;
			}
		}
		if (!foundElement) {
			System.out.println("Eelment not found in array");
		}

	}

	// @Test
	public static void copyArraytoAnother() {

		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		System.out.println("New Array Elements are :");
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}

	}

	// @Test
	public static void inset_Element_InTo_Index() {
		int requiredIndex = 4;
		int insertionValue = 200;
		for (int i = 0; i < a.length; i++) {

			if (i == requiredIndex) {
				a[i] = insertionValue;
			}
		}
		System.out.println("Array elements after inserted ne value");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	// @Test
	public static void min_And_Max_InAn_Array() {

		int minValue = a[0];
		int maxValue = a[0];

		for (int i = 0; i < a.length; i++) {

			if (minValue > a[i]) {
				minValue = a[i];
			}
			if (maxValue < a[i]) {
				maxValue = a[i];
			}
		}
		System.out.println("Max value in the array is :" + maxValue);
		System.out.println("Min value in the array is :" + minValue);

	}

	// @Test
	public static void reverse_Array_Elements() {

		System.out.println("Original array : " + Arrays.toString(a));
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}
		System.out.println("Reverse array : " + Arrays.toString(a));
	}

	// @Test
	public void removeduplicates() {
		
		int temp = a[0];
		
		for (int i = 0; i < a.length; i++) {
			
			if (temp != a[i]) {
				
				System.out.print(" " + temp);
				
				temp = a[i];
			}
		}
		System.out.print(" " + temp);
	}
	
	@Test
	public void print_duplicate_elements()
	{
		 int a[]  = {1, 2, 3, 4, 2, 7, 8, 8, 3};   
         
	        for(int i = 0; i < a.length; i++) {  
	            for(int j = i + 1; j < a.length; j++) {  
	                if(a[i] == a[j])  
	                    System.out.println(a[j]);  
	            }  
	        }  
	    
	}

	// @Test
	public void sortingwitharray() {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	// @Test
	public void primenumbers() {
		
		int n = 19;
		int flag = 0;
		if (n == 0 || n == 1) {
			System.out.println(n + " Is not a prime number");
		} else {
			for (int i = 2; i <= n / 2; i++) {
				
				if (n % i == 0) {
					System.out.println(n + " Is not a prime number");
					flag = 1;
					break;
				}

			}
		}
		if (flag == 0) {
			System.out.println(n + " is a prime number");
		}
	}

	// @Test
	public void fib() {
		int n1 = 0, n2 = 1, n3;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < 10; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}

	//@Test
	public void polymdromnumber() {
		
		int n = 454;
		int temp = 0, sum = 0, r;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println(sum + " Numbewr is polymdrom number");
		} else {
			System.out.println(sum + " number is not a polymdrom number");
		}

	}

	// @Test
	public void armgstrong_number() {
		int n = 153;
		int temp = 0, c = 0, r;
		temp = n;
		while (n > 0) {
			r = n % 10;
			c = c + (r * r * r);
			n = n / 10;

		}
		if (temp == c) {
			System.out.println(c + " is a armstrong number");

		} else {
			System.out.println(c + " is not a armgstrong number");
		}
	}

	// @Test
	public void factorial() {
		int f = 1, n = 5;

		for (int i = 1; i <= n; i++) {
			f = f * i;

		}
		System.out.println(f);
	}

	// @Test
	public void convet_array_to_arraylist() {

		String str[] = { "khaja", "ram", "geeta", "sunil" };

		List<String> li = new ArrayList<String>(Arrays.asList(str));

		System.out.println(li);

	}

	// @Test
	public void convert_arrylist_toarray() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("khaja");
		al.add("hussain");
		al.add("ram");

		Object[] a = al.toArray();

		for (Object obj : a) {
			System.out.println(obj + " ");

		}
	}

}
