import java.util.ArrayList;
import java.util.List;

final class UserProfile {

    private final int age;
    private final String name;
    private final String email;
    private List<String> courses;
 
    public UserProfile(int age, String name, String email,List<String> ncourses) {
        super();
        this.age = age;
        this.name = name;
        this.email = email;
        // creating a new list which is copy
        this.courses = new ArrayList<>(ncourses);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // return the copy of the original reference
    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }
}



public class Demo {
    
    public static void main(String[] args) {
        
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("React");

        UserProfile user1 = new UserProfile(24, "sagar", "sagarkirtakar2002@gmail.com",courses);
        System.out.println(user1.getAge());
        System.out.println(user1.getName());
        System.out.println(user1.getEmail());
        System.out.println(user1.getCourses());

        user1.getCourses().set(1, "Javascript");
        courses.add("Spring");
        System.out.println(user1.getCourses());
    }
}
