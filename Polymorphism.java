class APoly {
    public void show() {
        System.out.println("In A Show Method");
    }
}

class BPoly extends APoly {
    public void show() {
        System.out.println("In B Show Method");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        APoly obj = new APoly();
        obj.show();
        obj = new BPoly();
        obj.show();

      
    }

}
