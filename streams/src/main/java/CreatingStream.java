import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStream {
    public static void main(String[] args) {

        //Creating stream from Array
        String[] courses = {"Java", "JS", "TS"};
        Stream<String> courseString = Arrays.stream(courses);

        //Creating stream from Collection
        List<String> courseList = Arrays.asList("Java", "DS", "Spring");
        Stream<String> courseStream2 = courseList.stream();

        List<Course> myCourses = Arrays.asList(
                new Course("Java", 100),
                new Course("DS", 101),
                new Course("Spring", 103),
                new Course("Microservices", 103)
        );

        Stream<Course> myCourseStream = myCourses.stream();

        //Creating stream from values
        Stream<Integer> stream = Stream.of(1,2,3,4);









    }
}
