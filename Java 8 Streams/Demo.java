import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Demo {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35, 40, 45, 50);

        Optional<Integer> result = list.stream()
                            .filter(n -> n % 2 == 0)
                            .findFirst();

        System.out.println(result.get());
    }
}
