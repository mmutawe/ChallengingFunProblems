package arrays.trapping_rainwater;

public class RainWaterContainerImpl implements RainWaterContainer {

    // build a hash table to determine the amount of water blocks per height (Y-level).
    // each x-axis index will build an expected amount of water blocks until we reached the
    // wall on the other side. for blocks of water that never reached the wall height as
    // the one that start it then it will be ignored
    //
    // Brute Force
    // Space: O(n), Time: O(n * k) - where k is the tallest wall in the array
    @Override
    public int findTrappingWaterAreaV1(int[] arr) {

        if (arr.length < 3) {
            return 0;
        }

        // find tallest wall
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

    // Brute Force
    // Space: O(1), Time: O(n ^ 2)
    public int findTrappingWaterAreaV2(int[] arr) {

        if (arr.length < 3) {
            return 0;
        }

        int totalTrappingWater = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            // find the tallest wall from the left
            int maxLeft = 0;
            for (int j = 0; j < i; j++) {
                if (arr[j] > maxLeft) {
                    maxLeft = arr[j];
                }
            }
            // find the tallest wall from the right
            int maxRigth = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > maxRigth) {
                    maxRigth = arr[j];
                }
            }
            int waterLevel = Math.min(maxLeft, maxRigth);
            totalTrappingWater += Math.max((waterLevel - arr[i]), 0);
        }
        return totalTrappingWater;
    }

    // optimal solution
    // two Shifting Pointers
    // Space: O(1), Time: O(n)
    public int findTrappingWaterAreaV3(int[] arr) {

        if (arr.length < 3) {
            return 0;
        }

        int indexStart = 0;
        int indexEnd = arr.length - 1;
        int maxLeft = 0;
        int maxRight = 0;
        int totalTrappingWater = 0;

        while (indexStart != indexEnd) {
            if (arr[indexStart] < arr[indexEnd]) {
                if (arr[indexStart] < maxLeft) {
                    totalTrappingWater += (maxLeft - arr[indexStart]);
                } else {
                    maxLeft = arr[indexStart];
                }
                indexStart++;

            } else {
                if (arr[indexEnd] < maxRight) {
                    totalTrappingWater += (maxRight - arr[indexEnd]);
                } else {
                    maxRight = arr[indexEnd];
                }
                indexEnd--;

            }
        }
        return totalTrappingWater;
    }
}
