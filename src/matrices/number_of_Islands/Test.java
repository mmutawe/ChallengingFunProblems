package matrices.number_of_Islands;

import testsamples.matrices.MatricesTestSampleSML;

import static testsamples.matrices.MatricesTestSampleSML.*;

public class Test {
    public static void main(String[] args) {
        MatrixIslandsDetector matrixIslandsDetector = new MatrixIslandsDetectorImpl();

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
}
