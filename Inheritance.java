class NormalCalc {
    public int add(int a, int b) {
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


