package arrays.target_index_range_in_sorted_array;

public class SortedArrayIndexRangeTargetFinderImpl implements SortedArrayIndexRangeTargetFinder {

    // Optimal Solution
    // using binary search
    // Space: O(1), Time: O(log n)
    @Override
    public int[] searchRange(int[] nums, int target) {

        int[] range = {-1,-1};
        if (nums.length == 0) {
            return range;
        }

        searchRange(nums, target, 0, nums.length - 1, range);
        return range;
    }

    public void searchRange(int[] nums, int target, int start, int end, int[] range) {

        if (start > end){
            return;
        }

        int median = (start + end) / 2;
        if (nums[median] == target) {
            range[0] = median;
            range[1] = median;

            for (int i= median+1; i<= end; i++){
                if (target != nums[i]){
                    break;
                }
                range[1]=i;
            }

            for (int i= median-1; i>= start; i--){
                if (target != nums[i]){
                    break;
                }
                range[0]=i;
            }

        } else if (nums[median] > target) {
            searchRange(nums, target, start, median - 1, range);
        } else {
            searchRange(nums, target, median + 1, end, range);
        }
    }
}
