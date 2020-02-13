package java_interview_questions;

public class Throwexception {

	static void validate(int age) {
		if (age < 18) {
			throw  new ArithmeticException("not valied");
		} else {
			System.out.println("Welcome to vote");
		}
	}

	public static void main(String[] args) {

		validate(17);
	}

}
