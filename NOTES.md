# 📝 Java Notes 📝:

## - **Data Types**

```
 All data types: ***I Float, Clearly Don't Byte Short Long, Double. String!***


int:
Use for whole numbers without decimal points.
Example: int age = 25;


float:
Use for floating-point numbers with moderate precision.
Example: float temperature = 98.6f;

char:
Use for a single character.
Example: char grade = 'A';

boolean:
Use for variables that can have only two values: true or false.
Example: boolean isRaining = true;

byte:
Use when memory conservation is critical or when working with raw binary data.
Example: byte data = 120;

short:
Use when you need a larger range than byte but still want to conserve memory.
Example: short distance = 3000;

long:
Use for very large whole numbers.
Example: long population = 7000000000L;

double:
Use for floating-point numbers when higher precision is required.
Example: double pi = 3.14159265359;

String:
Use for storing sequences of characters or text.
Example: String greeting = "Hello, World!";


```

## - Object and Classes

- This is how you create objects and classes and call the method in the other class

 ```
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

 
 ```

## - Create Array 

```
int[] myNum = {10, 20, 30, 40};

OR

int myNum[] = {10, 20, 30, 40};


```
## - Array loop

```

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(nums[i][j] + " ");
            }

        }

        for (int n[] : nums) {
            for (int m : n) {
                System.out.println(m + " ");
            }

        }

```

## Static Variables

To make something as class variables not object variables.

```
class Mobile {

    static String name;
    
    static {
        name = "Mobile Apple IOS";
    }  // It will call static variable only once

    public void show() {
        System.out.println(" U_U L-7 in StaticVariable.java => " + brand + " : " + price + " : " + name);

    }

}


public class StaticVariable {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.name = "Xiaomo S2";

        Mobile obj2 = new Mobile();

        Mobile.name = "Xiaomo S3"; // Avoid

        obj1.show();
        obj2.show();



    }
}


```