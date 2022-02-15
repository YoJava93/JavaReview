import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {

        int[] myArray = {2,7,9,11};

        System.out.println(Arrays.toString(twoSumSol2(myArray, 9)));


    }

    public static int[] twoSumSol1(int [] array, int targetVal ) {

        for (int i = 0; i < array.length-1; i++) {
            for (int x = i +1; x < array.length; x++) {
                if ((array[i] + array[x]) == targetVal) {
                    return new int[] {i, x};
                }
            }
        }
        return new int[]{};
    }

    public static int[] twoSumSol2(int[] array, int targetVal) {
        // Iterate over the array. If a potential match exists return that indices else put the array value and index to map
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int potentialMatch = targetVal - array[i];
            if (map.containsKey(potentialMatch)) {
                return new int[]{i, map.get(potentialMatch)};
            }else {
                map.put(array[i], i);
            }
        }
         return new int[]{};
    }








}
