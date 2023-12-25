class A_AnonymousInnerClass {
    public void show() {
        System.out.println("Inside the A_AnonymousInnerClass");

    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A_AnonymousInnerClass obj = new A_AnonymousInnerClass() {  // Since this class has no name this practice is called Anonymous Inner Class
            public void show() {
                System.out.println("Inside the A_AnonymousInnerClass without extending");

            }

        };
        obj.show();
    }
}
