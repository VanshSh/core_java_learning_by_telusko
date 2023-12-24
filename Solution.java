import java.io.*;
import java.util.*;

class Area {
    public static int getArea(int breadth, int height) {
        if (breadth > 0 && height > 0) {
            return breadth * height;
        } else {
            throw new IllegalArgumentException("Breadth and height must be positive");
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Scanner scanner = new Scanner(System.in);
        int breadth = scanner.nextInt();
        int height = scanner.nextInt();

        scanner.close();

        try {
            int area = Area.getArea(breadth, height);
            System.out.println(area);
        } catch (IllegalArgumentException e) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }

    }
}
