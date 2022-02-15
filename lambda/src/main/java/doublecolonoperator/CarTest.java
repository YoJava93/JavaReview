package doublecolonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        //Zero-args
        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        //One-args
        Function<Integer, Car> f1 = (model) -> new Car(model);
        System.out.println(f1.apply(2009).getModel());

        Function<Integer, Car> f2 = Car::new;
        System.out.println(f2.apply(2022).getModel());

        //Two-args
        BiFunction<String, Integer, Car> b1 = (make, model) -> new Car(make, model);
        Car honda = b1.apply("Honda", 2021);
        System.out.println(honda.getMake() + " " + honda.getModel());

        BiFunction<String, Integer, Car> b2 = Car::new;
        Car hyundai = b2.apply("Honda", 2021);
        System.out.println(hyundai.getMake() + " " + hyundai.getModel());
    }
}