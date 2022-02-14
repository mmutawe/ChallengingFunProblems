package testsamples.matrices;

public class MatricesNumsTestSampleSML {
    public static final int[][] MATRIX_TEST_SAMPLE_ONE_ELEMENT_0 = {{0}};
    public static final int[][] MATRIX_TEST_SAMPLE_ONE_ELEMENT_1 = {{1}};
    public static final int[][] MATRIX_TEST_SAMPLE_ONE_ELEMENT_2 = {{2}};

    public static final int[][] MATRIX_TEST_SAMPLE_1 = {
            {2, 1, 1, 0, 0},
            {1, 1, 1, 0, 0},
            {0, 1, 1, 1, 1},
            {0, 1, 0, 0, 1}
    };

    public static final int[][] MATRIX_TEST_SAMPLE_2 = {
            {1, 1, 0, 0, 0},
            {2, 1, 0, 0, 0},
            {0, 0, 0, 1, 2},
            {0, 1, 0, 0, 1}
    };

    private static final int INF = Integer.MAX_VALUE;
    public static final int[][] MATRIX_TEST_SAMPLE_3 = {
            {INF, 1, 0, INF},
            {INF, INF, INF, -1},
            {INF, -1, INF, -1},
            {0, -1, INF, INF}
    };

    public static final int[][] MATRIX_TEST_SAMPLE_4 = {
            {0, INF, -1, INF},
            {-1, INF, INF, INF},
            {INF, -1, -1, 0},
            {INF, INF, -1, INF}
    };


}
