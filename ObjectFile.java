class Calculator {
    public int add() {
        int num1 = 6;
        int num2 = 56;
        int result = num1 + num2;
        System.out.println(" U_U L-6 in ObjectFile.java => " + result);
        return (result);

    }

}

public class ObjectFile {
    public static void main(String[] args) {

        Calculator calc = new Calculator();
        calc.add();

    }
}
