package matrices.distance_to_gate;

import testsamples.matrices.MatricesNumsTestSampleSML;

import static testsamples.matrices.MatricesNumsTestSampleSML.MATRIX_TEST_SAMPLE_3;
import static testsamples.matrices.MatricesNumsTestSampleSML.MATRIX_TEST_SAMPLE_4;

public class Test {
    public static void main(String[] args) {
        runAllTests();
    }

    public static void testNodesToGateDistanceCalculator() {
        EmptyNodesToGateDistanceCalculator nodesToGateDistanceCalculator = new EmptyNodesToGateDistanceCalculatorImpl();

        printMatrix(MATRIX_TEST_SAMPLE_3);
        System.out.println("--- --- --- --- ---");
        int[][] result = nodesToGateDistanceCalculator.getMatrixDistanceToGates(MATRIX_TEST_SAMPLE_3);
        printMatrix(result);
        System.out.println("\n=========================\n");

        printMatrix(MATRIX_TEST_SAMPLE_4);
        System.out.println("--- --- --- --- ---");
        result = nodesToGateDistanceCalculator.getMatrixDistanceToGates(MATRIX_TEST_SAMPLE_4);
        printMatrix(result);
    }

    public static void runAllTests() {
        testNodesToGateDistanceCalculator();
        System.out.println("-------------------------------");
    }

    private static void printMatrix(int[][] grid) {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                System.out.printf("%-10s", grid[y][x] != Integer.MAX_VALUE? grid[y][x] : "INF" );
            }
            System.out.println();
        }
    }
}
