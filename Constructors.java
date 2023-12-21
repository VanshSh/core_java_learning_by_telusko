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
