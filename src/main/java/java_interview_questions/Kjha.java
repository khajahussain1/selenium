package java_interview_questions;

import org.testng.annotations.Test;

public class Kjha {
	

	@Test
	public void test()
	{
		String x ="khaja";//length =5
		String y = "hussain";//7
		
		x=x+y;//x=khajahussain
		y=x.substring(0, (x.length()-y.length())); //y=khaja
		x=x.substring(y.length());//hussain
		
		System.out.println("x:- "+x+" "+"y:- "+y);
	}

	
}
