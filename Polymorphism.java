class APoly {
    public void show() {
        System.out.println("In A Show Method");
    }

    public final void announcement() {
        System.out.println("Don't over write me!");
    }
}

class BPoly extends APoly {
    public void show() {
        System.out.println("In B Show Method");
    }

    // public void announcement() {
    // System.out.println("I am over writing you!");
    // } // Can't use it beccause of final
}

public class Polymorphism {

    public static void main(String[] args) {
        APoly obj = new APoly();
        obj.show();
        obj = new BPoly();
        obj.show();
        obj.announcement();
        final double PIE = 3.14d;
        // PIE = 3.148456464d; // Can;t overwrite it because of the final in the variable
        System.out.println(PIE);
    }

}
