package arrays.two_sum;

import java.util.List;

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
public interface TwoSum<T> {
    List<T> getIndicesForSummationV1(int sum, int[] arr);

    List<T> getIndicesForSummationV2(int sum, int[] arr);

    List<T> getIndicesForSummationV3(int sum, int[] arr);
}
