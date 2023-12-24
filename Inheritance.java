class NormalCalc {
    public int add(int a, int b) {
        System.out.println(" U_U L-25 in Inheritance.java => " + "add method is getting called from parent here");
        return a + b;
    }

    public int sub(int a, int b) {

        return (a - b);

    }
}

class AdvCalc extends NormalCalc {

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public int add(int a, int b) {
        System.out.println(" U_U L-25 in Inheritance.java => " + "add method is getting called from child here"); // this is called method overwriting
        return a + b;

    }

}

public class Inheritance {

    public static void main(String[] args) {
        AdvCalc nc = new AdvCalc();
        int r1 = nc.add(5, 3);
        int r2 = nc.sub(10, 3);
        int r3 = nc.multi(6, 3);
        int r4 = nc.div(8, 3);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }

}
