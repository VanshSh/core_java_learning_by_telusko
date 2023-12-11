import java.util.Scanner;

public class Testing {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the newline character left by nextDouble()
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("Int: " + i);
        System.out.println("Double: " + d);
        System.out.println("String: " + s);

        scan.close();
    }
}
