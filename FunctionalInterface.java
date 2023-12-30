@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod(int i);
}

public class FunctionalInterface {

    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        MyFunctionalInterface myFunctionalInterface = (i) -> {
            System.out.println("Hello from myMethod! " + i);
        };
        // MyFunctionalInterface myFunctionalInterface = i -> System.out.println("Hello
        // from myMethod! " + i); // Can also be used like this

        // Calling the method
        myFunctionalInterface.myMethod(5);
    }
}
