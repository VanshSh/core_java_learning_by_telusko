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
