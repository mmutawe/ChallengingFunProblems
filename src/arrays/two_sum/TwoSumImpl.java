package arrays.two_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Given:
//      array of integers,
//      integer target
// Constrains:
//      - All numbers positive
//      - solution is not guaranteed (return NULL if no solution)
//      - array could contain a multiple pairs
//      - array is not sorted
// TODO - Required:
//      return the indices of the two numbers that add up to given target
//      Ex: {1,2,3,4,5,6} , sum = 5 --> {2,3}, {1,4}
public class TwoSumImpl implements TwoSum {

    // *** Brute Force Solution ***
    // two pointers technique
    // Space: O(1), Time: O(n^2)
    public List<IndicesPair> getIndicesForSummationV1(int sum, int[] arr) {

        List<IndicesPair> results = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == sum) {
                    results.add(new IndicesPair(i, j));
                }
            }
        }

        if (results.size() == 0) {
            return null;
        }

        return results;
    }

    // *** Optimal Solution ***
    // using a custom hash-table
    // Space: O(n), Time: O(n)
    public List<IndicesPair> getIndicesForSummationV2(int sum, int[] arr) {

        if (arr.length < 2) {
            return null;
        }

        List<IndicesPair> results = new ArrayList<>();
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        if (sum > max) {
            max = sum;
        }

        int[] hashTable = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            hashTable[arr[i]] = i + 1;
        }

        for (int i = 1; i <= sum / 2; i++) {
            if (hashTable[i] > 0 && hashTable[sum - i] > 0 && (sum - i) != i) {
                results.add(new IndicesPair(hashTable[i] - 1, hashTable[sum - i] - 1));
            }
        }

        if (results.size() == 0) {
            return null;
        }

        return results;
    }

    // *** Optimal Solution ***
    // using HashMap
    // Space: O(n), Time: O(n)
    public List<IndicesPair> getIndicesForSummationV3(int sum, int[] arr) {

        List<IndicesPair> results = new ArrayList<>();
        Map<Integer, Integer> hashMapOtherNum = new HashMap<>();

        int otherNum;
        for (int i = 0; i < arr.length; i++) {
            otherNum = sum - arr[i];
            if (hashMapOtherNum.containsKey(otherNum)) {
                results.add(new IndicesPair(i, hashMapOtherNum.get(otherNum)));
            } else {
                hashMapOtherNum.put(arr[i], i);
            }
        }

        if (results.size() == 0) {
            return null;
        }

        return results;
    }

    private class IndicesPair {
        int indexFirst;
        int indexSecond;

        public IndicesPair(int indexFirst, int indexSecond) {
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
