class APoly {
    public void show() {
        System.out.println("In A Show Method");
    }

    public final void announcement() {
        System.out.println("Don't overwrite me!");
    }
}

class BPoly extends APoly {
    @Override
    public void show() {
        System.out.println("In B Show Method");
    }

    public void show2() {
        System.out.println("In B Show2 Method");
    }

    // Uncommenting the next method will result in a compilation error
    // public void announcement() {
    // System.out.println("I am trying to overwrite you!");
    // }
}

public class Polymorphism {

    public static void main(String[] args) {
        APoly obj = new APoly();
        obj.show();

        // Polymorphism in action
        obj = new BPoly();
        obj.show();
        obj.announcement();

        final double PIE = 3.14d;
        // PIE = 3.148456464d; // Can't overwrite it because of the final in the
        // variable
        System.out.println(PIE);

        APoly obj1 = new BPoly();
        // APoly obj1 = (A) new BPoly(); // It is the same as above , it is called upcasting
        obj1.show();

        // Casting to the correct type
        BPoly obj2 = (BPoly) obj1; // It is called Downcasting
        obj2.show();
    }
}
