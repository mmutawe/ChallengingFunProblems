package matrices.distance_to_gate;

// Given:
//      - a 2D array containing '-1's (wall) and '0's (gates),
//        and INF's (empty room).
// TODO - Required:
//      Fill each empty room with the number of steps to the nearest gate.
//      (if it is impossible to reach a gate, leave INF as the value;
//      INF is equal to MAX_INT)
// Constrains:
//      - if receive empty matrix return empty matrix
//      - m == grid.length & n == grid[i].length
//          --> 1 <= m, n <= 30
public interface EmptyNodesToGateDistanceCalculator {
    int[][] getMatrixDistanceToGates(int[][] grid);
}
