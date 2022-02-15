import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {

        // 1. Create a set
        Set<Student> mySet = new HashSet<>();

        // 2. Add element
        mySet.add(new Student(7, "Ibadet"));
        mySet.add(new Student(8, "Ahmet"));
        mySet.add(new Student(9, "Muhabbet"));
        mySet.add(new Student(9, "Muhabbet")); // after adding hashcode in Student class, it will compare value instead of address.

        System.out.println(mySet);

        System.out.println("\nPrint first repeating character");
        String str = "Java Developer";
        System.out.println(firstRepeatingChar(str));

    }

    public static Character firstRepeatingChar(String str) {
        Set<Character> set = new HashSet<>();
        for (Character ch : str.toCharArray()) {
            if (!set.add(ch)) {
               return ch;
            }
        }
        return null;
    }

}
