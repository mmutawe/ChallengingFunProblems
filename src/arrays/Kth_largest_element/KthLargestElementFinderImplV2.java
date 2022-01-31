package arrays.Kth_largest_element;

import java.util.Arrays;

public class KthLargestElementFinderImplV2 implements KthLargestElementFinder {

    // Optimal Solution
    // using Nico Lomuto version of Quick Sort
    // Space: O(n), Time: O(n log n)
    @Override
    public int find(int[] nums, int k) {

        quickSort(nums, k);
        return nums[nums.length - k];
    }

    private void quickSort(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k);
    }

    private void quickSort(int[] nums, int start, int end, int k) {
        if (start >= end) {
            return;
        }

        int pivot = partition(nums, start, end);
        if (nums.length-k == pivot) {
            return;
        }
        if (nums.length-k < pivot) {
            quickSort(nums, start, pivot - 1, k);
        } else {
            quickSort(nums, pivot + 1, end, k);
        }
    }

    private int partition(int[] nums, int start, int end) {

        int pivot = end;
        int i = start - 1;
        int j = start;
        while (j < pivot) {
            if (nums[j] < nums[pivot]) {
                i++;
                swap(nums, i, j);
            }
            j++;
        }

        swap(nums, pivot, i+1);
        return i+1;
    }

    private void swap(int[] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}
