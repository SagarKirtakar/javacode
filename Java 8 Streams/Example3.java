import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example3 {
    
    public static void main(String[] args) {
        
        // Stream generate()

        Stream.generate(() -> "Hello")
        .limit(10)
        .forEach(System.out::println);

        // Stream distinct()

        List<Integer> numbers = Arrays.asList(10,20,30,40,20,10);

        List<Integer> uniqueNum = numbers.stream()
                                .distinct()
                                .collect(Collectors.toList());

        System.out.println(uniqueNum);



    }
}
