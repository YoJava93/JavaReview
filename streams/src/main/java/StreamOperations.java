import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4,4,3,5,5,6,7,8);
        myList.forEach(System.out::println);

        //Filter
        myList.stream()
                .filter(x -> x % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        //Limit
        System.out.println("*******LIMIT********");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .limit(1)
                .forEach(System.out::println);

        //Skip
        System.out.println("*******SKIP********");
        myList.stream()
                .filter(i -> i % 2 == 0)
                .skip(2)
                .forEach(System.out::println);

        //Map
        System.out.println("*******MAP********");
        myList.stream()
                .map(number -> number * 2)
                .filter(i -> i % 3 == 0)
                .forEach(System.out::println);

        System.out.println("********TASK********");
        List<String> words = Arrays.asList("Java", "Apple", "Honda", "Developer");
        words.stream()
                .map(String::length)
                .filter(word -> word > 4)
                .forEach(System.out::println);









    }
}
