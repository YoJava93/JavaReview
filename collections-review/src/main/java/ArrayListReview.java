import java.util.*;

public class ArrayListReview {
    public static void main(String[] args) {

        // Create ArrayList and a class
        List<Student> students = new LinkedList<>();

        // Add Elements to ArrayList
        students.add(new Student(1, "Jose"));
        students.add(new Student(2, "Sayed"));
        students.add(new Student(3, "Nick"));
        students.add(new Student(4, "Ronnie"));
        System.out.println(students);

        System.out.println("\nIterator prints here-----------------");
        // Iteration on ArrayLists
        // 1. For Loop with get(index)
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }

        // 2.Iterator
        Iterator iterator = students.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nPrinting with Iterator Backwards-----------------");
        // Backwards Iteration
       while (((ListIterator<?>)iterator).hasPrevious()) {
           System.out.println(((ListIterator<?>) iterator).previous());
       }

        System.out.println("\nPrinting with For each loop-----------------");
       // 3.for each loop
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("\nPrinting with Lambda-----------------");
        // 4. Lambda
        students.forEach(student -> System.out.println(student));

        // Sorting Elements in List
        Collections.sort(students, new sortByIdDesc());
        System.out.println(students);

        Collections.sort(students, new sortByNameDesc());
        System.out.println(students);
    }

    static class sortByIdDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }


}














