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
        B obj = new B(54);

    }
}
