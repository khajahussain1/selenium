package java_interview_questions;

import org.testng.annotations.Test;

public class Switchstatement 
{
	@Test
	public void test1()
	{
		String levelString = "Expert";
		
		int level = 0;
		
		switch(levelString)
		{
		case "Beganers" : level = 1;
		break;
		
		case "intermediate" : level = 2;
		break;
		
		case "Expert" : level = 3;
		
		break;
		
		default : level = 0;
		break;
		
		}
		System.out.println("your level is:" +level);
	}

}
