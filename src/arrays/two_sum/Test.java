package arrays.two_sum;

import static testsamples.arrays.ArraysTestSampleSML.*;

public class Test {

    public static void main(String[] args) {
        runAllTests();

//        testIndicesForSummation_V1();
//        testIndicesForSummation_V2();
//        testIndicesForSummation_V3();
    }

    public static void testIndicesForSummation_V1() {
        TwoSum customArrayOps = new TwoSumImpl();

        System.out.println(customArrayOps.getIndicesForSummationV1(5, ARR_TEST_SAMPLE_1));
        System.out.println(customArrayOps.getIndicesForSummationV1(11, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV1(25, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV1(5, ARR_TEST_SAMPLE_ONE_ELEMENT));
        System.out.println(customArrayOps.getIndicesForSummationV1(11, ARR_TEST_SAMPLE_EMPTY));
    }

    public static void testIndicesForSummation_V2() {
        TwoSum customArrayOps = new TwoSumImpl();

        System.out.println(customArrayOps.getIndicesForSummationV2(5, ARR_TEST_SAMPLE_1));
        System.out.println(customArrayOps.getIndicesForSummationV2(11, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV2(25, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV2(5, ARR_TEST_SAMPLE_ONE_ELEMENT));
        System.out.println(customArrayOps.getIndicesForSummationV2(11, ARR_TEST_SAMPLE_EMPTY));
    }

    public static void testIndicesForSummation_V3() {
        TwoSum customArrayOps = new TwoSumImpl();

        System.out.println(customArrayOps.getIndicesForSummationV3(5, ARR_TEST_SAMPLE_1));
        System.out.println(customArrayOps.getIndicesForSummationV3(11, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV3(25, ARR_TEST_SAMPLE_2));
        System.out.println(customArrayOps.getIndicesForSummationV3(5, ARR_TEST_SAMPLE_ONE_ELEMENT));
        System.out.println(customArrayOps.getIndicesForSummationV3(11, ARR_TEST_SAMPLE_EMPTY));
    }

    public static void runAllTests(){
        testIndicesForSummation_V1();
        System.out.println("-------------------------------");
        testIndicesForSummation_V2();
        System.out.println("-------------------------------");
        testIndicesForSummation_V3();
    }
}
