import java.io.*;
import java.util.*;

class JavaList {

}

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of elements in the list
        int numberOfList = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Create a list
        for (int i = 0; i < numberOfList; i++) {
            list.add(scanner.nextInt());
        }

        // Read the number of queries
        int numberOfQueries = scanner.nextInt();

        for (int i = 0; i < numberOfQueries; i++) {
            String queryType = scanner.next();
            if (queryType.equals("Insert")) {
                int index = scanner.nextInt();
                int value = scanner.nextInt();
                list.add(index, value);
            } else if (queryType.equals("Delete")) {
                int index = scanner.nextInt();
                list.remove(index);
            }

        }
        // Print the updated list
        for (int num : list) {
            System.out.print(num + " ");
        }
        scanner.close();
    }
}