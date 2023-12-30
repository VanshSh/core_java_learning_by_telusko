class A_Annontation {
    public void setName() {
        System.out.println("I am in A setName");
    }
}

class B_Annontaion extends A_Annontation {
    @Override
    public void setName() {
        System.out.println("I am in B setName");
    }
}

public class Annotations {
    public static void main(String[] args) {
        A_Annontation obj = new A_Annontation();
        obj.setName();
    }
}
