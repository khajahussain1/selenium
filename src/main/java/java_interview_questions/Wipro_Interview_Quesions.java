package java_interview_questions;

import org.testng.annotations.Test;

import java.util.Scanner;

public class Wipro_Interview_Quesions {

    //input=AAABBB
    //o/p=A3B3
    @Test
    public void test_01() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i <= str.length(); i++) {
            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        System.out.println("Output: " + result);

        sc.close();
    }

}
