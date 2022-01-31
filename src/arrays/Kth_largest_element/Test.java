package arrays.Kth_largest_element;

import java.util.Arrays;

import static testsamples.arrays.ArraysTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }


    public static void testKthLargestElementFinderV1() {
        KthLargestElementFinder finderKthLargestNum = new KthLargestElementFinderImplV1();

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT) + " --> ",
                1 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_ONE_ELEMENT, 1)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_1) + " --> ",
                2 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_1, 2)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_1)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_6) + " --> ",
                3 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_6, 3)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_1)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_7) + " --> ",
                4 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_7, 4)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_7)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_8) + " --> ",
                1 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_8, 1)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_8)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_9) + " --> ",
                2 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_9, 2)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_9)+ "\n");
    }

    public static void testKthLargestElementFinderV2() {
        KthLargestElementFinder finderKthLargestNum = new KthLargestElementFinderImplV2();

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT) + " --> ",
                1 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_ONE_ELEMENT, 1)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_ONE_ELEMENT) + "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_1) + " --> ",
                2 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_1, 2)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_1)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_6) + " --> ",
                3 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_6, 3)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_1)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_7) + " --> ",
                4 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_7, 4)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_7)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_8) + " --> ",
                1 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_8, 1)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_8)+ "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_9) + " --> ",
                2 + "th Largest: " + finderKthLargestNum.find(ARR_TEST_SAMPLE_9, 2)
                        + ", " + Arrays.toString(ARR_TEST_SAMPLE_9)+ "\n");

    }

    public static void runAllTests() {
        testKthLargestElementFinderV1();
        System.out.println("-------------------------------");
        testKthLargestElementFinderV2();
        System.out.println("-------------------------------");

    }
}
