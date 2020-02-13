package java_interview_questions;


public class NewTest {
	
	public static void sound(int a){
		System.out.println(a);
	   }
	public static void sound(String name){
		System.out.println(name);
	   }
	
   public static void main(String args[]){
	   /*NewTest a = new NewTest();
	   a.sound(10);
	   a.sound("khaja");*/
	   NewTest.sound(10);
	   NewTest.sound("khaja");
	  
   }
}