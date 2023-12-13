import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result = Integer.toString(number);

        if (result.equals(Integer.toString(number))) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer");
        }

        // Close the scanner
        scanner.close();

        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
    }
}