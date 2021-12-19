package arrays.most_water_container;

// Given:
//      - array of positive integers
//      - each integer represents the height of vertical line on a chart
// Constrains:
//      - do the left and right sides of the graph count as walls
// TODO - Required:
//      - Find two lines which together with the x-axis forms a container
//      that would hold the greatest amount of water
//      - return the area of water it would hold
public interface WaterContainer {
    int getLargestContainerAreaV1(int[] arr);

    int getLargestContainerAreaV2(int[] arr);
}
