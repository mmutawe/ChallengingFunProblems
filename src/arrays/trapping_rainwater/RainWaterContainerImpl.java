package arrays.trapping_rainwater;

public class RainWaterContainerImpl implements RainWaterContainer {

    // build a hash table to determine the amount of water blocks per height (Y-level).
    // each x-axis index will build an expected amount of water blocks until we reached the
    // wall on the other side. for blocks of water that never reached the wall height as
    // the one that start it then it will be ignored
    //
    // Space: O(n), Time: O(n * k) - where k is the tallest wall in the array
    @Override
    public int findTrappingWaterAreaV1(int[] arr) {

        if (arr.length < 3) {
            return 0;
        }

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int[] waterBlockPerLevel = new int[max];
        int totalTrappingWater = 0;

        int tallestWallHeight = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                for (int j = arr[i - 1]; j < Math.min(arr[i], tallestWallHeight); j++) {
                    totalTrappingWater += waterBlockPerLevel[j];
                    waterBlockPerLevel[j] = 0;
                }

                if (arr[i] < tallestWallHeight) {
                    for (int j = arr[i]; j < tallestWallHeight; j++) {
                        waterBlockPerLevel[j]++;
                    }
                } else {
                    tallestWallHeight = arr[i];
                }
            } else {
                for (int j = arr[i]; j < tallestWallHeight; j++) {
                    waterBlockPerLevel[j]++;
                }
            }
        }

        return totalTrappingWater;
    }
}
