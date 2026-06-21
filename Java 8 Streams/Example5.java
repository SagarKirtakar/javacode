
import java.util.Arrays;
import java.util.List;

public class Example5 {
    
    public static void main(String[] args) {
        
        // skip() in Stream 
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.stream()
                    .skip(3)
                    .forEach(System.out::print);

        System.out.println();

        // limit() in Stream
        nums.stream()
                    .limit(5)
                    .forEach(System.out::print);
    }
}
