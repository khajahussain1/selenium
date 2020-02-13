package java_interview_questions;

class Student
{
	private String name;
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		
		Student s=new Student();
		s.setname("Raja");
		System.out.println(s.getname());
		
		
	}}
