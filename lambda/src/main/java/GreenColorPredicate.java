public class GreenColorPredicate implements Predicate {

    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }

}
