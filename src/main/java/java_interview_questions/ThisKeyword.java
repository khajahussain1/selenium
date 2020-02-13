package java_interview_questions;


   /*
    * 
  1) this keyword in java:-
      this keyword is a reference variable that refers to the current object. (state and behaviour)
      
  2) Usage of java this keyword
      this can be used to refer current class instance variable.
      this can be used to invoke current class method (implicitly)
      this() can be used to invoke current class constructor.
      this can be passed as an argument in the method call.
      this can be passed as argument in the constructor call.
      this can be used to return the current class instance from the method.
      
 3)  this keyword can be used to refer current class instance variable. If there is ambiguity between the instance 
     variables and parameters, this keyword resolves the problem of ambiguity.
     
 4)  If local variables(formal arguments) and instance variables are different, there is no need to use this keyword.
   
 5)  invoke the current class method  by using this keyword. If you don't use the this keyword, compiler 
     automatically adds this keyword while invoking the method.
      
 6)  Real usage of this() constructor call:-
     The this() constructor call should be used to reuse the constructor from the constructor. It maintains the chain between the
     constructors i.e. it is used for constructor chaining. 

*/
public class ThisKeyword {
	int rollno;
	String name;
	float fee;

	ThisKeyword(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	ThisKeyword(int rollno, String name, float fee) {
		this(rollno, name); //reusing constractor
		this.fee = fee;
	}

	void display() {
		System.out.println(rollno + " " + name + " " + fee);
	}



	public static void main(String args[]) {
		ThisKeyword s1 = new ThisKeyword(111, "ankit");
		ThisKeyword s2 = new ThisKeyword(112, "sumit", 6000f);
		s1.display();
		s2.display();
	}

}
