package selenium_interview_questions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void testSum()
  {
	// we need to create an object in order to use them
	  
      SoftAssert sa = new SoftAssert();

      System.out.println("\nRunning Test -> testSum");
      
     // SomeClassToTest obj = new SomeClassToTest();
      
     // int result = obj.sumNumbers(1, 2);
      
      int result = 3;
      
      // we need to use that object when we are calling them
      
      sa.assertEquals(result, 2);
      
      System.out.println("\nLine after assert 1");
      
      sa.assertEquals(result, 3);
      
      System.out.println("\nLine after assert 2");


      // the asserts used till now will not throw any exception if they fail. The @Test will not fail either.
      // If you need the test method to fail at the end, showing all exceptions, you need to use assertAll()
      sa.assertAll();
  }
}
