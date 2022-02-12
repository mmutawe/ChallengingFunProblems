package matrices.rotting_oranges;

import testsamples.matrices.MatricesNumsTestSampleSML;

import static testsamples.matrices.MatricesNumsTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testOrangesRottingTimer() {
        OrangesRottingTimer orangesRottingTimer = new OrangesRottingTimerImpl();

        int numOfIslands=0;
//        System.out.println("MATRIX_TEST_SAMPLE_ONE_ELEMENT_0");
//        numOfIslands = orangesRottingTimer.getFreshOrangesRottingTime(MATRIX_TEST_SAMPLE_ONE_ELEMENT_0);
//        System.out.println("numOfIslands: " + numOfIslands + "\n");
//
//        System.out.println("MATRIX_TEST_SAMPLE_ONE_ELEMENT_1");
//        numOfIslands = orangesRottingTimer.getFreshOrangesRottingTime(MATRIX_TEST_SAMPLE_ONE_ELEMENT_1);
//        System.out.println("numOfIslands: " + numOfIslands + "\n");

        System.out.println("MATRIX_TEST_SAMPLE_1");
        numOfIslands = orangesRottingTimer.getFreshOrangesRottingTime(MATRIX_TEST_SAMPLE_1);
        System.out.println("numOfIslands: " + numOfIslands + "\n");

//        System.out.println("MATRIX_TEST_SAMPLE_2");
//        numOfIslands = orangesRottingTimer.getFreshOrangesRottingTime(MATRIX_TEST_SAMPLE_2);
//        System.out.println("numOfIslands: " + numOfIslands + "\n");
    }

    public static void runAllTests() {
        testOrangesRottingTimer();
        System.out.println("-------------------------------");
    }
}
