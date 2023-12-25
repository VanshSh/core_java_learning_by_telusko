class InnerA {

    int age = 5;

    public void show() {
        System.out.println("In InnerA Show");
    }

    static class InnerB {
        public void config() {
            System.out.println("InnerB Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        InnerA obj = new InnerA();
        obj.show();

        // InnerA.InnerB obj1 = obj.new InnerB();
        InnerA.InnerB obj1 = new InnerA.InnerB(); // If class InnerB is static

        obj1.config();

    }
}
