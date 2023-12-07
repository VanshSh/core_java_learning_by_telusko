class Calculator {
    public int add() {
        int num1 = 6;
        int num2 = 56;
        int result = num1 + num2;
        System.out.println(" U_U L-6 in ObjectFile.java => " + result);
        return result;
    }
}

public class ObjectFile {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        int result = calc.add(); // Save the result in a variable
        System.out.println("Result from Calculator: " + result);

        int[] myNum = { 10, 20, 30, 40 };
        int[][] twoDArray = new int[3][4]; // 3 rows, 4 columns

        // Initialize the elements in the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                twoDArray[i][j] = i + j; // You can initialize with any values as needed
            }
        }

        // Access and print the elements in the 2D array
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row after printing each row
        }
    }
}