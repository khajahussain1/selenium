package java_interview_questions;

import org.testng.annotations.Test;

public class Trianglenumber {

	//@Test
	public void print_triangle_numbers() {

		int n = 5;

		for (int i = 0; i <= n; i++) {

			int m = 1;

			for (int j = i; j <= n; j++) {

				System.out.print(m);

				m++;
			}
			
			System.out.println();
		}

	}

	// @Test
	public void print_triangle_number() {
		
		//int i;
		int num = 1;

		for (int i = 0; i < 5; i++) {
			for(int k=0; k<5-i; k++)
			{
				System.out.print(" ");
				
			}

			for (int j = 0; j <= i; j++) {
				
				System.out.print(num+" ");
				num++;

			}
			System.out.println();

		}

	}

	// @Test
	public void Simple_pyramid_pattern_with_starts() {

		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");

			}

			System.out.println();

		}

	}

	 //@Test
	public void After_180_Rotation_starts() {
		int i, n = 10;

		for (i = 0; i < n; i++) {
			for (int j = 2 * (n - i); j >= 0; j--) {
				System.out.print(" ");

			}

			for (int k = 0; k <= i; k++) {
				System.out.print("* ");

			}

			System.out.println();

		}

	}

	@Test
	public void Printing_Triangle_starts() {
		int n = 5;
		int l=1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				System.out.print(" ");

			}
			for (int k = 0; k <= i; k++) {
				System.out.print(l+" ");
				l++;

			}

			System.out.println();
			

		}
	}

}
