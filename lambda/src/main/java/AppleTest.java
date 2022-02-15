import java.util.*;
import java.util.function.Predicate;

public class AppleTest {
    public static void main(String[] args) {
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(250, Color.RED));
        inventory.add(new Apple(100, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

//        List<Apple> heavyApple = filterApples(inventory, new HeavyPredicate());
//        List<Apple> colorApple = filterApples(inventory, new GreenColorPredicate());

        System.out.println(filterApples(inventory, a -> a.getWeight() > 100 ));
        System.out.println(filterApples(inventory, a -> a.getColor().equals(Color.GREEN)));

    }

    private static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> predicate) {

        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

}
