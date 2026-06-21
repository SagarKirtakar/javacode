import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Example2 {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(10,15,20,25,30,40);

        Optional<Integer> result = list.parallelStream()
                                    .filter(n -> n%2 == 0)
                                    .findAny();

        System.out.println(result.get());

    }
}
