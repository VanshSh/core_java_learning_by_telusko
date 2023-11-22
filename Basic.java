public class Basic {
    // 1 Hour DONE Till datatype
    public static void main(String[] args) {
        // Primitive data types
        int myNum = 5;
        float myFloatNum = 5.99f;
        char myLetter = 'D';
        boolean myBool = true;

        // Additional primitive data types
        byte myByte = 127; // 8-bit signed integer
        short myShort = 32767; // 16-bit signed integer
        long myLong = 9223372036854775807L; // 64-bit signed integer
        double myDouble = 19.99d; // 64-bit double-precision floating-point

        // Reference data type
        String myText = "Hello";

        // Print variables
        System.out.println("int: " + myNum);
        System.out.println("float: " + myFloatNum);
        System.out.println("char: " + myLetter);
        System.out.println("boolean: " + myBool);
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("long: " + myLong);
        System.out.println("double: " + myDouble);
        System.out.println("String: " + myText);

        int num = 7;
        num += 5;
        System.out.println(" U_U L-33 in main.java => " + num);

        float floatValue = 54.56f;
        double doubleValue = 54.50;
        boolean resultValue = floatValue >= doubleValue;
        System.out.println(" U_U L-37 in Basic.java => " + resultValue);

        int n = 4;
        String result;
        if (n % 2 == 0)
            result = "EVEN";
        else
            result = "ODD";

        System.out.println(" U_U L-46 in Basic.java => " + result);
        System.out.println(" U_U L-46 in Basic.java => " + 4 % 2);

    }
}
