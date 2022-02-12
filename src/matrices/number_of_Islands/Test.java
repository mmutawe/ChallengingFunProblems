package matrices.number_of_Islands;

import static testsamples.matrices.MatricesCharsTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testMatrixIslandsDetectorImplV1() {
        MatrixIslandsDetector matrixIslandsDetector = new MatrixIslandsDetectorImplV1();

        System.out.println("MATRIX_TEST_SAMPLE_ONE_ELEMENT_0");
        int numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_ONE_ELEMENT_0);
        System.out.println("numOfIslands: " + numOfIslands + "\n");

        System.out.println("MATRIX_TEST_SAMPLE_ONE_ELEMENT_1");
        numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_ONE_ELEMENT_1);
        System.out.println("numOfIslands: " + numOfIslands + "\n");

        System.out.println("MATRIX_TEST_SAMPLE_1");
        numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_1);
        System.out.println("numOfIslands: " + numOfIslands + "\n");

        System.out.println("MATRIX_TEST_SAMPLE_2");
        numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_2);
        System.out.println("numOfIslands: " + numOfIslands + "\n");
    }
    public static void testMatrixIslandsDetectorImplV2() {
        MatrixIslandsDetector matrixIslandsDetector = new MatrixIslandsDetectorImplV2();

        System.out.println("MATRIX_TEST_SAMPLE_ONE_ELEMENT_0");
        int numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_ONE_ELEMENT_0);
        System.out.println("numOfIslands: " + numOfIslands + "\n");

        System.out.println("MATRIX_TEST_SAMPLE_ONE_ELEMENT_1");
        numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_ONE_ELEMENT_1);
        System.out.println("numOfIslands: " + numOfIslands + "\n");

        System.out.println("MATRIX_TEST_SAMPLE_1");
        numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_1);
        System.out.println("numOfIslands: " + numOfIslands + "\n");

        System.out.println("MATRIX_TEST_SAMPLE_2");
        numOfIslands = matrixIslandsDetector.getNumOfIslands(MATRIX_TEST_SAMPLE_2);
        System.out.println("numOfIslands: " + numOfIslands + "\n");
    }

    public static void runAllTests() {
        testMatrixIslandsDetectorImplV1();
        System.out.println("-------------------------------");
        testMatrixIslandsDetectorImplV2();
        System.out.println("-------------------------------");
    }
}
