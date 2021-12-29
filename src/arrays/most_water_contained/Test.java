package arrays.most_water_contained;

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

        String format = "%-20s%s";

        System.out.println("* Largest Container Area:");
        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_1),
                " --> " + waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_1) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_2),
                " --> " + waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_2) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT),
                " --> " + waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_EMPTY),
                " --> " + waterContainer.getLargestContainerAreaV1(ARR_TEST_SAMPLE_EMPTY) + "\n");

        System.out.println();
    }

    public static void testIndicesForSummation_V2() {
        WaterContainer waterContainer = new WaterContainerImpl();

        String format = "%-20s%s";

        System.out.println("* Largest Container Area:");
        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_1),
                " --> " + waterContainer.getLargestContainerAreaV2(ARR_TEST_SAMPLE_1) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_2),
                " --> " + waterContainer.getLargestContainerAreaV2(ARR_TEST_SAMPLE_2) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT),
                " --> " + waterContainer.getLargestContainerAreaV2(ARR_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_EMPTY),
                " --> " + waterContainer.getLargestContainerAreaV2(ARR_TEST_SAMPLE_EMPTY) + "\n");

        System.out.println();
    }

    public static void runAllTests() {
        testLargestContainerArea_V1();
        System.out.println("-------------------------------");
        testIndicesForSummation_V2();
    }
}
