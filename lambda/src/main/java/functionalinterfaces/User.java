package functionalinterfaces;

import lombok.*;

@Data
@Builder
public class User {
    private String firstName;
    private String lastName;
    private int age;
}
