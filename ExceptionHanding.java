public class ExceptionHanding {
    public static void main(String[] args) {

        int i = 18;
        int j = 0;

        try {
            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("j should be greater than 0");
            }
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error  " + e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
