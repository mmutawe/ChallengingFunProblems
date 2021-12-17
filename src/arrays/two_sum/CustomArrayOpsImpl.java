package arrays.two_sum;

import java.util.ArrayList;
import java.util.List;

// Given:
//      array of integers,
//      integer target
// Constrains:
//      1- All numbers positive
//      2= no duplicates
//      3- is there a solution available, and what do we return if there is no solution ?
//      4- Can there be multiple pairs that add up tp the target ?
//      5- is the array sorted
// TODO - Required:
//      return the indices of the two numbers that add up to given target
//      Ex: {1,2,3,4,5,6} , sum = 5 --> {2,3}, {1,4}
public class CustomArrayOpsImpl implements CustomArrayOps{

    // *** Brute Force Solution ***
    // two pointers technique
    public List<CombinedIndices> getIndicesForSummationV1(int sum, int[] arr) {

        List<CombinedIndices> results = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    results.add(new CombinedIndices(i, j));
                }
            }
        }

        if (results.size() == 0) {
            return null;
        }

        return results;
    }

    private class CombinedIndices {
        int indexFirst;
        int indexSecond;

        public CombinedIndices(int indexFirst, int indexSecond) {
            this.indexFirst = indexFirst;
            this.indexSecond = indexSecond;
        }

        @Override
        public String toString() {
            return "{" +
                    "indexFirst=" + indexFirst +
                    ", indexSecond=" + indexSecond +
                    '}';
        }
    }
}
