package arrays.trapping_rainwater;

// Given:
//      - array of integers,
//      - each element represent the elevation map height
//      - width is 1
// Constrains:
//      - the sides does not count as walls
//      - all integer are positive
//      - input can be an empty list
// TODO - Required:
//      return how much rainwater can be trapped
//      Ex: {0,1,0,2,1,0,2} --> ans: 4
//                 XX(  )XX
//      _____  XX()XXXX()XX____
public interface RainWaterContainer {
    int findTrappingWaterAreaV1(int[] arr);
    int findTrappingWaterAreaV2(int[] arr);
}
