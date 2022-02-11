package matrices.number_of_Islands;

// Given:
//      - a 2D array containing only '1's (land) and '0's (water)
// TODO - Required:
//      count the number of islands.
//      (An island is land connected horizontally or vertically)
// Constrains:
//      - Assume anything outside of the 2D array is water.
//      - m == grid.length & n == grid[i].length
//          --> 1 <= m, n <= 30
public interface MatrixIslandsDetector {
    int getNumOfIslands(char[][] grid);
}
