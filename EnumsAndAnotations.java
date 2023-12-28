enum Status {
    Running, Failed, Pending, Success
}

public class EnumsAndAnotations {

    public static void main(String[] args) {
        int i = 5;
        Status s = Status.Pending;
        Status[] ss = Status.values();
        System.out.println(s);
        for (Status x : ss) {
            System.out.println(s + " " + x.ordinal());
        }
    }

}
