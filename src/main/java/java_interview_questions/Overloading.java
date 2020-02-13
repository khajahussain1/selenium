package java_interview_questions;

public class Overloading {
	
	public int add(int a, int b)
	{
		int c=a+b;
		//System.out.println(c);
		return c;
		
	}
	public double add(double a, double b, double d)
	{
		double e=a+b+d;
		//System.out.println(e);
		return e;
		
	}

	public static void main(String[] args) {
		Overloading ol=new Overloading();
		//ol.add(10, 15);
		//ol.add(40.23, 63.58, 52.3);
		
		System.out.println(ol.add(10, 20));
		System.out.println(ol.add(10,  20, 30));

	}

}
