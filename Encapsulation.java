class Human {
    int age;
    private String name;
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.age = 22;
        obj.name = "Vansh Sharma";
        System.out.println(obj.name);
        System.out.println(obj.age);
    }

}

