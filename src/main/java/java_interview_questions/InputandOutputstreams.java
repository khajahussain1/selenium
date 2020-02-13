package java_interview_questions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.SequenceInputStream;

public class InputandOutputstreams {

	public static void main(String args[]) {
		try {
			FileInputStream fin1 = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/selenium_interview_questions/OR1");
			FileInputStream fin2 = new FileInputStream(
					System.getProperty("user.dir") + "/src/main/java/selenium_interview_questions/OR1");
			FileOutputStream fout = new FileOutputStream(
					System.getProperty("user.dir") + "/src/main/java/selenium_interview_questions/OR1");
			SequenceInputStream sis = new SequenceInputStream(fin1, fin2);
			int i;
			while ((i = sis.read()) != -1) {
				fout.write(i);
			}
			sis.close();
			fout.close();
			fin1.close();
			fin2.close();
			System.out.println("Success..");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
