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

}

public class StaticVariable {
    public static void main(String[] args)

    {

        // Class.forName('Mobile'); // To call static method if you don't want to call object
        Mobile obj1 = new Mobile();
        obj1.brand = "Xiaomi";
        obj1.price = "11,000";
        obj1.name = "Xiaomo S2";

        Mobile obj2 = new Mobile();
        obj2.brand = "Xiaomi";
        obj2.price = "11,000";
        // obj2.name = "Xiaomo S3"; // Avoid call static wiht class name
        Mobile.name = "Xiaomo S3";

        obj1.show();
        obj2.show();

    }
}
