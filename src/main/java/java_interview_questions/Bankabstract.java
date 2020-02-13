package java_interview_questions;

abstract class Bank1 {

	Bank1() {
		System.out.println("Bank is working daily");
	}

	abstract int getrateofint();

	void get() {
		System.out.println("reta of intrested is very low");

	}
}

class SB extends Bank1 {
	int getrateofint() {
		return 7;
	}
}

class AXI extends Bank1 {
	int getrateofint() {
		return 9;
	}
}

public class Bankabstract {

	public static void main(String[] args) {

		
		Bank1 b;
		b = new SB();
		System.out.println("rate of intrest" + b.getrateofint() + " %");
		b = new AXI();
		System.out.println("rate of intrest" + b.getrateofint() + " %");

	}

}
