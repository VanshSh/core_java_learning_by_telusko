interface Interface_A {
    int age = 22; // These are final and static
    String country = "India";

    void show();

    void config();
}

interface Interface_X {
    void run();
}

interface Interface_Y extends Interface_X {

}

class Interface_B implements Interface_A, Interface_Y {
    public void show() {
        System.out.println("In show Interface_B");
    }

    public void config() {
        System.out.println("In config Interface_B");
    }

    public void run() {
        System.out.println("In run Interface_B");
    }
}

public class Interface {
    public static void main(String[] args) {

        Interface_A obj;
        obj = new Interface_B();
        obj.show();
        obj.config();

        Interface_Y obj1 = new Interface_B();
        obj1.run();
        System.out.println(Interface_A.age);
        System.out.println(Interface_A.country);

    }
}
