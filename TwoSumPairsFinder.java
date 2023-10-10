import java.util.*;

public class TwoSumPairsFinder {

    public static List<List<Integer>> findTwoSumPairs(int[] array, int target) {
        List<List<Integer>> result = new ArrayList<>();

        if (array == null || array.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];
            if (complementMap.containsKey(complement)) {
                List<Integer> pair = Arrays.asList(array[i], complement);
                result.add(pair);
            }
            complementMap.put(array[i], i);
        }

        return result;
    }