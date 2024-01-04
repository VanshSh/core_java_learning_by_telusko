import java.util.Arrays;
import java.util.List;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 7, 8);
        list.forEach(n -> System.out.println(n));
        int sum = 0;
        for (int n : list) {
            if (n % 2 == 0) {
                n = n * 2;
                sum += n;
            }
        }
        System.out.println(sum);
    }
}
