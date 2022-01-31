package arrays.target_index_range_in_sorted_array;

import testsamples.arrays.ArraysTestSampleSML;

import java.util.Arrays;

import static testsamples.arrays.ArraysTestSampleSML.ARR_TEST_SAMPLE_10;
import static testsamples.arrays.ArraysTestSampleSML.ARR_TEST_SAMPLE_EMPTY;

public class Test {
     public static void main(String[] args) {
        runAllTests();
    }


    public static void testKthLargestElementFinderV1() {
        SortedArrayIndexRangeTargetFinder indexRangeFinder = new SortedArrayIndexRangeTargetFinderImpl();

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_EMPTY) + ", target: " + 8 +" --> ",
                Arrays.toString(indexRangeFinder.searchRange(ARR_TEST_SAMPLE_EMPTY, 8)) + "\n");


        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_10) + ", target: " + 8 +" --> ",
                Arrays.toString(indexRangeFinder.searchRange(ARR_TEST_SAMPLE_10, 8)) + "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_10) + ", target: " + 7 +" --> ",
                Arrays.toString(indexRangeFinder.searchRange(ARR_TEST_SAMPLE_10, 7)) + "\n");

        System.out.printf("%-30s%s", Arrays.toString(ARR_TEST_SAMPLE_10) + ", target: " + 6 +" --> ",
                Arrays.toString(indexRangeFinder.searchRange(ARR_TEST_SAMPLE_10, 6)) + "\n");
    }


    public static void runAllTests() {
        testKthLargestElementFinderV1();
        System.out.println("-------------------------------");
    }
}
