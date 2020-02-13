package java_interview_questions;

import org.testng.annotations.Test;

public class A4 {
 
  
  @Test(priority =-1)
  public void Babas() 
  {
	  System.out.println("Babas runnung");
  }
  
  @Test(priority =0)
  public void Abbas() 
  {
	  System.out.println("Abbas running ");
	  
  }
}
