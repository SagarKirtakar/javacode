import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example4 {
    
    public static void main(String[] args) {
        
        List<String> names = Arrays.asList("Amar", "Bhola" , "Chotu", "Amol" , "Bhavik", "Chetan");

        Map<Character, List<String>>  group = names.stream()
                        .collect(Collectors.groupingBy(firstChar -> firstChar.charAt(0)));

                        System.out.println(group);
    }
}
