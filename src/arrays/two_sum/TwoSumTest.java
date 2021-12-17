package arrays.two_sum;

import testsamples.arrays.ArraysTestSampleSML;

import java.util.List;

import static testsamples.arrays.ArraysTestSampleSML.*;

public class TwoSumTest {

    public static void main(String[] args) {
        testIndicesForSummation_V1();
    }

    private static void testIndicesForSummation_V1() {
        CustomArrayOps customArrayOps = new CustomArrayOpsImpl();

        System.out.println(customArrayOps.getIndicesForSummationV1(5, ARR_TEST_SAMPLE_1));
        System.out.println(customArrayOps.getIndicesForSummationV1(11, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV1(25, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV1(5, ARR_TEST_SAMPLE_ONE_ELEMENT));
        System.out.println(customArrayOps.getIndicesForSummationV1(11, ARR_TEST_SAMPLE_EMPTY));
    }
}
