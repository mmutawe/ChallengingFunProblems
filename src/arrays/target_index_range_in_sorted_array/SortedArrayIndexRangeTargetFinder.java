package arrays.target_index_range_in_sorted_array;

// Given:
//      An array of integers sorted in ascending order
// Constrains:
//      - 0 <= nums.length <= 10^5
//      - if target not found return [-1,-1]
//      - if target founded once return same index [indexA,indexA]
// TODO - Required:
//      return the starting and ending index of a given target value in an array i.e. [index1,index2]
//      Ex: {5,7,7,8,8,10}, target=8 --> [3,4]
//                 ^ ^
public interface SortedArrayIndexRangeTargetFinder {
    int[] searchRange(int[] nums, int target);

}
