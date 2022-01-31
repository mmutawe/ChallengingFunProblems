package arrays.Kth_largest_element;

public class KthLargestElementFinderImplV1 implements KthLargestElementFinder {

    // Optimal Solution
    // using Quick Sort
    // Space: O(n), Time: O(n log n)
    @Override
    public int find(int[] nums, int k) {

        quickSort(nums);
        return nums[nums.length - k];
    }

    private void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int pivot = partition(nums, start, end);

        quickSort(nums, start, pivot - 1);
        quickSort(nums, pivot + 1, end);
    }

    private int partition(int[] nums, int i, int j) {

        int pivot = i++;
        while (i < j) {
            while (i < nums.length && nums[i] <= nums[pivot]) {
                i++;
            }

            while (j >= i && nums[j] >= nums[pivot]) {
                j--;
            }

            if (i < j) {
                swap(nums, i, j);
            }
        }
        if (nums[pivot] > nums[j]) {
            swap(nums, j, pivot);
        }
        return j;
    }

    private void swap(int[] nums, int index1, int index2) {
        int tmp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = tmp;
    }
}
