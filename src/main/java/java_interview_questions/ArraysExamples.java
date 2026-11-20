package java_interview_questions;

import java.util.*;
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

	//swipe_first_and_last_words i string
	//ex: "we working for capgemini" convert to "capgemini working for we"
	@Test
	public static void swipe_first_and_last_words(){
		//"we working for capgemini" convert to "capgemini working for we"
		String str = "we working for capgemini";

		String a[]=str.split(" ");
		String temp = a[0];

		a[0]=a[a.length-1];
		a[a.length-1]=temp;

		for(String s: a)
		{
			System.out.print(s+" ");
		}
	}

	//swipe_second_and_third_words_and_chances
	//ex: "we working for capgemini" convert to "we for working capgemini"
	@Test
	public static void swipe_second_and_third_words_and_chances() {
		String str = "we working for capgemini";
		String a[] = str.split(" ");
		String temp = a[1];
		a[1] = a[a.length - 2];
		a[a.length - 2] = temp;

		for (String s : a) {
			System.out.print(s + " ");
		}
	}
		@Test
		public static void maximum_length_world_polymdrom_M1()
		{
			String str = "My madam name is Geetha and she knows malayalam";
			Set<String> hs=new HashSet<>();
			String s[]=str.split(" ");
			for(int i=0; i<s.length; i++)
			{
				//System.out.print(s[i]+" ");
				String a[]=s[i].split("");
				String rev="";
				for(int j=a.length-1; j>=0; j--)
				{
					rev=rev+a[j];
				}
				if(rev.equals(s[i]))
				{
					//System.out.print(rev);
					hs.add(rev);
				}
			}

			String biggest="";
			for(String value: hs)
			{
				if(biggest==""||biggest.length()<value.length())
				{
					biggest=value;
				}
			}
			System.out.println(biggest);

		}



	@Test
	public static void minimum_length_world_polyndrom()
	{
		String str = "My madam name is Geetha and she knows malayalam";
		Set<String> hs=new HashSet<>();
		String s[]=str.split(" ");
		for(int i=0; i<s.length; i++)
		{
			//System.out.print(s[i]+" ");
			String a[]=s[i].split("");
			String rev="";
			for(int j=a.length-1; j>=0; j--)
			{
				rev=rev+a[j];
			}
			if(rev.equals(s[i]))
			{
				//System.out.print(rev);
				hs.add(rev);
			}
		}

		String smallest="";
		for(String value: hs)
		{
			if(smallest==""||smallest.length()>value.length())
			{
				smallest=value;
			}
		}
		System.out.println(smallest);

	}

	@Test
	public static void biggest_length_word_in_array()
	{
		String a[] = {"my", "madam", "Geetha", "malayalam"};

		String biggest=a[0];
		for(String value: a)
		{
			if(biggest.length()<value.length())
			{
				biggest=value;
			}
		}

		System.out.println(biggest);
	}

	@Test
	public static void smallest_length_word_in_array()
	{
		String a[] = {"my", "madam", "Geetha", "malayalam"};

		String smallest=a[0];
		for(String value: a)
		{
			if(smallest.length()>value.length())
			{
				smallest=value;
			}
		}

		System.out.println(smallest);
	}

	@Test
	public static void reverse_characters_in_word_except_one_word(){
		String str = "hello world capgemini tech";
		String s[]=str.split(" ");
		for(int i=0; i<s.length; i++)
		{
			if(s[i].equals("capgemini"))
			{
				System.out.print(s[i]+" ");
			}else{
				String a[]=s[i].split("");
				for(int j=a.length-1; j>=0; j--)
				{
					System.out.print(a[j]);
				}
				System.out.print(" ");
			}
		}

	}

	@Test
	public static void swap_two_numbers(){
		int x=10;
		int y=20;

		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}

	@Test
	public static void swap_two_Strings(){
		String x= "khaja";
		String y="hussain";

		x=x+y;
		y=x.substring(0, (x.length()-y.length()));
		x=x.substring(y.length());

		System.out.println("X = "+x);
		System.out.println("Y = "+y);
	}

	@Test
	public static void remove_duplicates_from_asscending_order()
	{
		String a[]={"hello", "world", "capgemini", "hello", "world"};
		Set<String> hs=new TreeSet<>(Arrays.asList(a));

		for(String s: hs)
		{
			System.out.print(s+" ");

		}

	}

	//Method-1
	@Test
	public void remove_duplicates_vowels_M1()
	{
		String s = "MoOntttuaaAAday";
		Set<Character> vowels=new HashSet<>();
		StringBuilder result=new StringBuilder();

		for(char ch: s.toCharArray())
		{
			char lower = Character.toLowerCase(ch);

			if("aeiou".indexOf(lower)!=-1)
			{
				if(vowels.contains(lower))
				{
					continue;
				}
				vowels.add(lower);
			}
			result.append(lower);
		}
		System.out.println(result);

	}

	//Method-2
	@Test
	public static void remove_duplicates_vowels_M2() {

		String s = "MoOntttuaaAAday";
		Map<Character, Integer> vowels=new HashMap<>();
		StringBuilder result=new StringBuilder();

		for(char ch: s.toCharArray())
		{
			char lower=Character.toLowerCase(ch);
			if("aeiou".indexOf(lower)!=-1)
			{
				vowels.put(lower, vowels.getOrDefault(lower, 0)+1);
				if(vowels.get(lower)==1)
				{
					result.append(ch);
				}
			}else{
				result.append(ch);
			}
		}
		System.out.println(result);
	}

	//Method-1
	@Test
	public static void remove_duplicates_consonents_M1()
	{
		String s = "MoOntttuaaAAday";
		Map<Character, Integer> consonent=new HashMap<>();
		StringBuilder result=new StringBuilder();

		for(char ch: s.toCharArray())
		{
			char lower = Character.toLowerCase(ch);

			if("aeiou".indexOf(lower)==-1 && Character.isLetter(lower))
			{
				consonent.put(lower, consonent.getOrDefault(lower, 0)+1);

				if(consonent.get(lower)==1)
				{
					result.append(lower);
				}
			}else{
				result.append(lower);
			}
		}
		System.out.println(result);
	}

	@Test
	public static void vowels_count()
	{
		String s = "MoOntttuaaAAday";

		int vowelscount=0;
		for(char ch: s.toCharArray())
		{
			char lower =Character.toLowerCase(ch);
			if("aeiou".indexOf(lower)!=-1)
			{
				vowelscount++;
			}
		}
		System.out.println(vowelscount);
	}

	@Test
	public static void consonent_count()
	{
		String s = "MoOntttuaaAAday";

		int consonentcount=0;
		for(char ch: s.toCharArray())
		{
			char lower =Character.toLowerCase(ch);
			if("aeiou".indexOf(lower)==-1&&Character.isLetter(ch))
			{
				consonentcount++;
			}
		}
		System.out.println(consonentcount);
	}

	@Test
	public static void count()
	{
		String s = "KhajaHussain";
		int uppercase=0;
		int lowercase=0;

		for(char ch: s.toCharArray())
		{
			if(Character.isUpperCase(ch))
			{
				uppercase++;
			}

			if(Character.isLowerCase(ch))
			{
				lowercase++;
			}
		}

		System.out.println("uppercase = "+uppercase);
		System.out.println("lowercase = "+lowercase);
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
	public void convert_hashmap_Arraylist_1()
	{
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "khaja");
		m.put("2", "vali");
		Set<Entry<String, String>> s = m.entrySet();
		List<Entry<String, String>> al = new ArrayList<Entry<String, String>>(s);
		System.out.println(al);
	}

	//@Test
	public void convert_hashmap_Arraylist_2()
	{
		Map<String, String> hm = new HashMap<>();
		hm.put("1", "khaja");
		hm.put("2", "vali");

		List<Map.Entry<String, String>> al=new ArrayList<>(hm.entrySet());

		System.out.print(al);
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

	//Method-1
	@Test
	public void print_duplicate_elements_and_remove_uniq_elements()
	{
		List<String> al = new ArrayList<>();
		al.add("khaja");
		al.add("hussain");
		al.add("khaja");
		al.add("hussain");
		al.add("poola");
		al.add("vali");
		al.add("vali");

		Map<String, Integer> hm= new HashMap<>();

		for(String s: al)
		{
			hm.put(s, hm.getOrDefault(s, 0)+1);
		}

		for(Map.Entry<String, Integer> entry: hm.entrySet())
		{
			//print only duplicates "entry.getValue()>1"
			//print only unq "entry.getValue()==1"
			//print only uniq and duplicates "entry.getValue()>=1"
			if(entry.getValue()>1)
			{
				System.out.println(entry);
			}
		}
	}

	//Method-2
	@Test
	public void print_duplicate_elements_and_remove_uniq_elements2()
	{
		Integer a[]  = {1, 2, 3, 4, 2, 7, 8, 8, 3,4,3,4,3,4,5,3,4,5,6,454,3,4,5,6,454};

		List<Integer> al = new ArrayList<>(Arrays.asList(a));

		Set<Integer> uniq=new HashSet<>();
		Set<Integer> duplicate=new HashSet<>();

		for(Integer i: al)
		{
			if(!uniq.add(i))
			{
				duplicate.add(i);
			}
		}

		for(Integer s: duplicate)
		{
			System.out.println(s+"-->"+Collections.frequency(al,s));
		}
	}

	//Method-3
	@Test
	public void print_duplicate_elements_and_remove_uniq_elements3()
	{
		Integer a[]  = {1, 2, 3, 4, 2, 7, 8, 8, 3,4,3,4,3,4,5,3,4,5,6,454,3,4,5,6,454};

		Map<Integer, Integer> hm=new HashMap<>();

		for(Integer i: a)
		{
			hm.put(i, hm.getOrDefault(i, 0)+1);
		}

		for(Map.Entry<Integer, Integer> entry: hm.entrySet())
		{
			//System.out.println(entry);

			if(entry.getValue()>1)
			{
				System.out.println(entry);
			}
		}
	}

	// @Test
	public void print_multiple_of_9_values()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1");
		int n1= sc.nextInt();

		System.out.println("Enter n2");
		int n2= sc.nextInt();

		int sum=n1+n2;

		if(sum%9==0)
		{
			System.out.println(sum+" is divided by 9");
		}else{
			System.out.println(sum+" is not divided by 9");
		}

	}
	// @Test
	public void print_odd_and_even_numbers()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n");
		int n= sc.nextInt();

		System.out.print("Even numbers are = ");
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}

		}
		System.out.println();
		System.out.print("Odd numbers are = ");
		for(int j=1; j<=n; j++)
		{
			if(j%2!=0)
			{
				System.out.print(j+" ");
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
