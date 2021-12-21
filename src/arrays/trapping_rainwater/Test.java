package arrays.trapping_rainwater;

import java.util.Arrays;

import static testsamples.arrays.ArraysTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testTrappingWaterAreaV1() {
        RainWaterContainer rainWaterContainer = new RainWaterContainerImpl();

        String format = "%-24s%s";

        System.out.println("* Trapping Water Area:");
        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_1),
                "-->" + rainWaterContainer.findTrappingWaterAreaV1(ARR_TEST_SAMPLE_1) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_2),
                "-->" + rainWaterContainer.findTrappingWaterAreaV1(ARR_TEST_SAMPLE_2) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_3),
                "-->" + rainWaterContainer.findTrappingWaterAreaV1(ARR_TEST_SAMPLE_3) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_4),
                "-->" + rainWaterContainer.findTrappingWaterAreaV1(ARR_TEST_SAMPLE_4) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT),
                "-->" + rainWaterContainer.findTrappingWaterAreaV1(ARR_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_EMPTY),
                "-->" + rainWaterContainer.findTrappingWaterAreaV1(ARR_TEST_SAMPLE_EMPTY) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_5),
                "-->" + rainWaterContainer.findTrappingWaterAreaV1(ARR_TEST_SAMPLE_5) + "\n");

    }

    public static void testTrappingWaterAreaV2() {
        RainWaterContainer rainWaterContainer = new RainWaterContainerImpl();

        String format = "%-24s%s";

        System.out.println("* Trapping Water Area:");
        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_1),
                "-->" + rainWaterContainer.findTrappingWaterAreaV2(ARR_TEST_SAMPLE_1) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_2),
                "-->" + rainWaterContainer.findTrappingWaterAreaV2(ARR_TEST_SAMPLE_2) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_3),
                "-->" + rainWaterContainer.findTrappingWaterAreaV2(ARR_TEST_SAMPLE_3) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_4),
                "-->" + rainWaterContainer.findTrappingWaterAreaV2(ARR_TEST_SAMPLE_4) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT),
                "-->" + rainWaterContainer.findTrappingWaterAreaV2(ARR_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_EMPTY),
                "-->" + rainWaterContainer.findTrappingWaterAreaV2(ARR_TEST_SAMPLE_EMPTY) + "\n");

        System.out.printf(format, Arrays.toString(ARR_TEST_SAMPLE_5),
                "-->" + rainWaterContainer.findTrappingWaterAreaV2(ARR_TEST_SAMPLE_5) + "\n");

    }

    public static void runAllTests() {
        testTrappingWaterAreaV1();
        System.out.println("-------------------------------");
        testTrappingWaterAreaV2();

    }
}
