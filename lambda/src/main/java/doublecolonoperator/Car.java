package doublecolonoperator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String make;
    private int model;

    public Car(int model) {
        this.model = model;
    }

}
