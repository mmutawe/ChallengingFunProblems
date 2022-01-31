package arrays.Kth_largest_element;

// Given:
//      Unsorted array of integers,
// Constrains:
//      - Kth largest element in sorted order, nit the Kth distinct element.
//      - assume an answer is always available
// TODO - Required:
//      return the kth largest element
//      Ex: {5,3,1,6,4,2}, k=2 --> SORT --> {1,2,3,4,5,6} , ans = 5
public interface KthLargestElementFinder {
    int find(int[] nums, int k);
}
