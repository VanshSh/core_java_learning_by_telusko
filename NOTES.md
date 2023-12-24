# 📝 Java Notes of [Youtube Course](https://www.youtube.com/watch?v=BGTx91t8q50&list=WL&index=1&t=20974s&ab_channel=Telusko).

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

- To make something as class variables not object variables.

```
class Mobile {
    String brand;
    String price;
    static String name;

    static {
        name = "Mobile Apple IOS";
    } // It will call static variable only once

    public void show() {
        System.out.println(" U_U L-7 in StaticVariable.java => " + brand + " : " + price + " : " + name);

    }

    public static void show1(Mobile obj) {
        // Also here we can not call directly non static variable inside static method
        // But we can do indirectly by passing the object while calling this method
        System.out.println(obj.brand + " : " + obj.price + " : " + name);
    }

}

public class StaticVariable {
    public static void main(String[] args)

    {

        // Class.forName('Mobile'); // To call static method if you don't want to call
        // object
        Mobile obj1 = new Mobile();
        obj1.brand = "Xiaomi";
        obj1.price = "11,000";
        obj1.name = "Xiaomo S2";

        Mobile obj2 = new Mobile();
        obj2.brand = "Xiaomi";
        obj2.price = "11,000";
        // obj2.name = "Xiaomo S3"; // Avoid, call static with class name
        Mobile.name = "Xiaomo S3";

        obj1.show();
        obj2.show();

        // Mobile.show(); Not allowed to call non static method directly from class
        Mobile.show1(obj1);

    }
}


```

## Encapsulation

```

class Human {
    private int age = 11;
    private String name = "Vansh"; // It is available only in the same class

    public int getAge() {
        return (age);
    }

    public String getName() {
        return (name);
    }

    public void setAge(int value) {
        age = value;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.setAge(30);
        // obj.name = "Vansh Sharma";

        System.out.println(obj.getName() + " : " + obj.getAge());
    }

}

```

## Constructors
- It should be same as a class name
- Does not return anything
- It get called automatically whenever object is created

```
class Human {
    private int age;
    private String name;

    public Human() { // Default constructor

        age = 12;
        name = "Vansh";
    }

    public Human(int a, String userName) { // Parameterized constructor

        System.out.println(" U_U L-3 in Constructors.java => " + "Calling Constructor");
        age = a;
        name = userName;
    }

    public int getAge() {
        return age;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human();

        System.out.println(" U_U L-22 in Constructors.java => " + obj1.getAge());

    }
}



```

## this and super
- If we add parameters to the object then it will call the parameterized constructor along with the default constructor of the parent class.
- Every constructor has the super() method even if we don't call it this super() method calls the constructor of the parent class based on if we pass the parameter or not.
- Every class in Java extends the Object class as in our case with class A
- this() will call all the constructor of the same class

```
class A {
    public A() {

        System.out.println(" U_U L-2 in ThisandSuper.java => " + "in A");
    }

    public A(int a) {
        System.out.println(" U_U L-12 in ThisandSuper.java => " + "in a int");
    }
}

class B extends A {

    public B() { // Constructor

        System.out.println(" U_U L-8 in ThisandSuper.java => " + "in B");
    }

    public B(int b) {
        this(); // will call all the constructor of the same classs
        // super(5) this will call the parameterized constructor of parnt class
        System.out.println(" U_U L-12 in ThisandSuper.java => " + "in b int");
    }
}

public class ThisandSuper {
    public static void main(String[] args) {
        B obj = new B(54); // this will call the parameterized constructor of the B

    }
}


```
