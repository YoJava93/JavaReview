import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2029122323","2021427123")),
                new Employee(101, "Ozzy", "ozzy@cydeo.com", Arrays.asList("7033124124","7031234212")),
                new Employee(102, "Peter", "peter@cydeo.com", Arrays.asList("2539122323","2531427423"))
        );
    }
}
