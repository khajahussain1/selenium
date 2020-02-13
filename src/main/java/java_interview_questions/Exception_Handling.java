package java_interview_questions;


   /*
   
    1) How many types of exception can occur in a Java program?
       There are mainly two types of exceptions: checked and unchecked. Here, an error is considered as the unchecked 
       exception.
       According to Oracle, there are three types of exceptions:

       Checked Exception: Checked exceptions are the one which are checked at compile-time.
       For example, SQLException, ClassNotFoundException, etc.

       Unchecked Exception: Unchecked exceptions are the one which are handled at runtime because they can not be checked 
       at compile-time. For example, ArithmaticException, NullPointerException, ArrayIndexOutOfBoundsException, etc.

       Error: Error cause the program to exit since they are not recoverable.
        For Example, OutOfMemoryError, AssertionError, etc.

*  2)  What is Exception Handling?
       Exception Handling is a mechanism that is used to handle runtime errors. It is used primarily to handle checked 
       exceptions. Exception handling maintains the normal flow of the program. There are mainly two types of exceptions:
       checked and unchecked. Here, the error is considered as the unchecked exception. 
*  
*  Note:-  java.lang.Throwable class is the root class of Java Exception hierarchy which is inherited by two subclasses: 
*      Exception and Error. The Throwable class is the base class for Error and Exception.
*      
*   3) What is finally block?
       The "finally" block is used to execute the important code of the program. It is executed whether an exception is 
       handled or not. In other words, we can say that finally block is the block which is always executed. Finally block 
       follows try or catch block. If you don't handle the exception, before terminating the program, JVM runs finally block, 
       (if any). The finally block is mainly used to place the cleanup code such as closing a file or closing a connection. 
       Here, we must know that for each try block there can be zero or more catch blocks, but only one finally block. The 
       finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that 
       causes the process to abort).   
*      
*   4) What is the difference between throw and throws?
*   
                   throw keyword	                                          throws keyword
       The throw keyword is used to throw an exception explicitly.	The throws keyword is used to declare an exception.
       The checked exceptions cannot be propagated with throw only.	The checked exception can be propagated with throws
       The throw keyword is followed by an instance.	            The throws keyword is followed by class.
       The throw keyword is used within the method.	                The throws keyword is used with the method signature.
       You cannot throw multiple exceptions.	                    You can declare multiple exceptions, e.g., public void 
                                                                    method()throws IOException, SQLException.

    5) What is userdefined Exception?
   
*
*/
class Calculation extends Exception  
{  
    public Calculation()   
    {  
        System.out.println("Calculation class is instantiated");  
    }  
    public void add(int a, int b)  
    {  
        System.out.println("The sum is "+(a+b));  
    }  
}  
public class Exception_Handling{
	
     public static void main(String []args){  
    	 
        try  
        {  
            throw new Calculation();   
        }  
        catch(Calculation c){  
            c.add(10,20);  
        }  
    }  
}   
