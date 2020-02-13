package java_interview_questions;

import java.util.ArrayList;
import java.util.List;

class Books {
	int id;
	String author, name, publisher;

	int quantity;

	public Books(int id, String author, String name, String publisher, int quantity) {
		this.id = id;
		this.author = author;
		this.name = name;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class Arraylist {

	public static void main(String[] args) {
		List<Books> list = new ArrayList<Books>();

		Books b1 = new Books(101, "Khaja", "ram", "sam", 20);
		Books b2 = new Books(102, "sundar", "roj", "nam", 40);
		list.add(b1);
		list.add(b2);

		for (Books b : list) {
			System.out.println(b.id + " " + b.author + " " + b.name + " " + b.publisher + " " + b.quantity);

		}

	}
}
