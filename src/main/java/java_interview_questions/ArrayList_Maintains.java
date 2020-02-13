package java_interview_questions;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.testng.annotations.Test;

public class ArrayList_Maintains {

	/*
	 * When to use ArrayList and LinkedList in Java
	 * 
	 * Array list use internally dynamic array. Dynamic array work based on index so
	 * it is fast for search operation. ArrayList provides constant time for search
	 * operation, so it is better to use ArrayList if searching is more frequent
	 * operation than add and remove operation.
	 * 
	 * Linked list use internally double array. Double array perform add and remove
	 * operation very fast due to it will add and remove element in both directions
	 * forward and backed word direction. The LinkedList provides constant time for
	 * add and remove operations. So it is better to use LinkedList for
	 * manipulation. ArrayList is better to access data whereas LinkedList is better
	 * to manipulate data
	 * 
	 * A linked list is a collection of multiple nodes where each node stores a reference to a data, as well as a reference to 
	 * the next node of the list
	 */
	// @Test
	public void remove_Duplicate_elemnts_in_an_arraylist() {
		
		List<String> al = new ArrayList<String>();
		al.add("khaja");
		al.add("hussain");
		al.add("khaja");
		al.add("hussain");

		Set<String> s = new HashSet<String>(al);

		System.out.println(s);
	}

	//@Test
	public void count_duplecate_strings_in_ArrayList() {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("khaja");
		al.add("hussain");
		al.add("khaja");
		al.add("poola");
		al.add("poola");

		HashSet<String> hs = new HashSet<String>(al);

		for (String s : hs) {
			System.out.println(Collections.frequency(al, s) + "-->" + s);
		}
	}
	
	//@Test
	public void read_word_documents() throws InvalidFormatException, IOException
	{
		 FileInputStream fis = new FileInputStream("C:\\Users\\khaja.h\\Desktop\\khajahussain.docx");
		   XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
		   XWPFWordExtractor extractor = new XWPFWordExtractor(xdoc);
		   System.out.println(extractor.getText());
	}
	
	//@Test
	public void Count_repeated_Words_in_word_documents() throws IOException {

		String line = "";

		List<String> words = new ArrayList<String>();

		// Opens file in read mode
		FileReader file = new FileReader(System.getProperty("user.dir") + "/src/test/source/khajahussain1.txt");
		BufferedReader br = new BufferedReader(file);

		// Reads each line
		while ((line = br.readLine()) != null) {
			String str[] = line.toLowerCase().split(" ");

			for (String s : str) {
				words.add(s);
			}
		}

		Set<String> hs = new HashSet<String>(words);

		for (String s : hs) {
			System.out.println(Collections.frequency(words, s) + "-->" + s);
		}
		br.close();
	}

	// @Test
	public void reverse_an_ArrayList() {
		
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator<Integer> it = al.iterator();

		Collections.reverse(al);
		List<Integer> rev = new ArrayList<Integer>();
		
		while (it.hasNext()) {
			
			//System.out.println(it.next());
			rev.add(it.next());
		}
		System.out.println(rev);
		
		

	}
	
	//@Test
	public void count_no_of_duplicate_charectors_or_words_in_String_method1() {

		String s = "khajahussain";
		
		ArrayList<String> words= new ArrayList<String>();
		
		String str[]=s.split("");
		
		for(String st : str)
		{
			words.add(st);
			
		}
		
		Set<String> hs = new HashSet<String>(words);

		for (String ss : hs) {
			System.out.println(Collections.frequency(words, ss) + "-->" + ss);
		}
	}

	//@Test
	public void count_no_of_duplicate_charectors_or_words_in_String_method2() {
		String s = "khajahussain";

		//String str[] = s.split("");
		int dis = 0;

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					dis++;
				}

			}

			System.out.println(s.charAt(i) + " -->" + dis);
			String d = Character.toString(s.charAt(i)).trim();
			 //String d= String.valueOf(s.charAt(i)).trim();
			s = s.replaceAll(d, "");
			dis = 0;
		}

	}
	
	@Test
	public void count_no_of_duplicate_words_in_String() {
		
		String s = "khajahussain";
		
		//String s = "Welcome to Java khaja hussain Session Session khaja Session khaja hussain";

		String[] a = s.split(""); 
		
		int dis = 1; 

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i + 1; j < a.length; j++) 
			{

				if (a[i].equals(a[j])) // Checking for both strings are equal
				{
					//dis++;
					 dis = dis + 1; // if equal increment the count
					a[j] = "0"; // Replace repeated words by zero
				}
			}
			if (a[i] != "0") {
		      System.out.println(a[i] + "-->" + dis); // Printing the word along with count
			dis = 1;
			}

		}
	}
		


}
