package arrays.trapping_rainwater;

public class RainWaterContainerImpl implements RainWaterContainer {

    // build a hash table to determine the amount of water blocks per height (Y-level).
    // each x-axis index will build an expected amount of water blocks until we reached the
    // wall on the other side. for blocks of water that never reached the wall height as
    // the one that start it then it will be ignored
    //
    // Space: O(n), Time: O(n * k) - where k is the tallest wall in the array
    //                  ~ O(n)
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

    // Brute Force
    public int findTrappingWaterAreaV2(int[] arr) {

        if(arr.length < 3) {
            return 0;
        }

        int totalTrappingWater=0;
        for (int i=1; i<arr.length-1;i++){
            // find the tallest wall from the left
            int maxLeft=0;
            for (int j=0; j<i; j++){
                if (arr[j] > maxLeft){
                    maxLeft = arr[j];
                }
            }
            // find the tallest wall from the right
            int maxRigth=0;
            for (int j=i+1; j<arr.length; j++){
                if (arr[j] > maxRigth){
                    maxRigth = arr[j];
                }
            }
            int waterLevel = Math.min(maxLeft,maxRigth);
            totalTrappingWater += Math.max((waterLevel - arr[i]), 0);
        }
        return totalTrappingWater;
    }
}
