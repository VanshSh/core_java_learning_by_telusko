import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int string_length = A.length();
        boolean isPalindrome = false;
        for (int i = 0; i <= string_length / 2; i++) {
            char startingEle = A.charAt(i);
            char endingEle = A.charAt(string_length - 1 - i);

            if (startingEle == endingEle) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");

        }

        sc.close();
    }
}
