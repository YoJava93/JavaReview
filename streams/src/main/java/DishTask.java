import static java.util.Comparator.comparing;

public class DishTask {
    public static void main(String[] args) {

        // Print all dish's name that have less than 400 calories
        System.out.println("*****************************************");
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .map(Dish::getName)
                .forEach(System.out::println);

        System.out.println("****************************************");

        // Print the length of the name of the dish
        DishData.getAll().stream()
                .map(Dish::getName)
                .map(String::length)
                .forEach(System.out::println);

        System.out.println("****************************************");

        // Print Three High Caloric Dish Name > 300
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() > 300)
                .map(Dish::getName)
                .limit(3)
                .forEach(System.out::println);

        System.out.println("****************************************");

        // Print all dishes name that are bellow 400 calories in sorted
        DishData.getAll().stream()
                .filter(dish -> dish.getCalories() < 400)
                .sorted(comparing(Dish::getCalories).reversed())
                .map(Dish::getName)
                .forEach(System.out::println);



























    }
}
