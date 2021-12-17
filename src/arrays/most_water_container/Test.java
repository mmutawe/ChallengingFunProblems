package arrays.most_water_container;

import java.util.Arrays;

import static testsamples.arrays.ArraysTestSampleSML.ARR_TEST_SAMPLE_1;
import static testsamples.arrays.ArraysTestSampleSML.ARR_TEST_SAMPLE_2;
import static testsamples.arrays.ArraysTestSampleSML.ARR_TEST_SAMPLE_EMPTY;
import static testsamples.arrays.ArraysTestSampleSML.ARR_TEST_SAMPLE_ONE_ELEMENT;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testLargestContainerArea_V1() {
        WaterContainer waterContainer = new WaterContainerImpl();

        System.out.println(Arrays.toString(ARR_TEST_SAMPLE_1));
        System.out.println("Largest Container Area: " +
                waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_1) + "\n");

        System.out.println(Arrays.toString(ARR_TEST_SAMPLE_2));
        System.out.println("Largest Container Area: " +
                waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_2) + "\n");

        System.out.println(Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT));
        System.out.println("Largest Container Area: " +
                waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.println(Arrays.toString(ARR_TEST_SAMPLE_EMPTY));
        System.out.println("Largest Container Area: " +
                waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_EMPTY) + "\n");
    }

    public static void testIndicesForSummation_V2() {
    }


    public static void runAllTests() {
        testLargestContainerArea_V1();
        System.out.println("-------------------------------");
    }
}
