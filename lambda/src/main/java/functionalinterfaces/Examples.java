package functionalinterfaces;

import java.util.Map;
import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        //***********PREDICATE************//
        Predicate<Integer> lessThen = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 18;
            }
        };

        lessThen.test(68);

        Predicate<Integer> lesserThan = a -> a > 18;
        System.out.println(lesserThan.test(31));

        //***********CONSUMER************//
        Consumer<Integer> display = i -> System.out.println(i);
        display.accept(50);

        //***********BICONSUMER************//
        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + y);
        addTwo.accept(100, 200);

        //***********FUNCTION************//
        Function<String, String> fun = s -> "Hello " + s + "!!!";
        System.out.println(fun.apply("Ozzy"));

        //***********SUPPLIER************//
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
