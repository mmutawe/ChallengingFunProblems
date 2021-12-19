package arrays.most_water_container;

public class WaterContainerImpl implements WaterContainer {

    // *** Brute Force Solution ***
    // two pointers technique
    // Space: O(1), Time: O(n^2)
    public int getLargestContainerAreaV1(int[] arr) {

        int areaMax = 0;

        for (int i = 0; i < arr.length; i++) {
            int height = 0;
            int area = 0;
            for (int j = i + 1; j < arr.length; j++) {
                height = (arr[j] > arr[i]) ? arr[i] : arr[j];
                area = height * (j - i);
                if (area > areaMax) {
                    areaMax = area;
                }
            }
        }
        return areaMax;
    }

    // optimal solution
    // two Shifting Pointers
    // Space: O(1), Time: O(n)
    public int getLargestContainerAreaV2(int[] arr) {

        if (arr.length < 2) {
            return 0;
        }

        int indexStart = 0;
        int indexEnd = arr.length - 1;
        int areaMax = 0;

        while (indexStart != indexEnd) {
            int width = indexEnd - indexStart;
            int height = arr[indexEnd] > arr[indexStart] ? arr[indexStart] : arr[indexEnd];
            int area = width * height;
            if (area > areaMax){
                areaMax = area;
            }

            if (arr[indexStart] > arr[indexEnd]){
                indexEnd--;
            } else {
                indexStart++;
            }
        }

        return areaMax;
    }
}
