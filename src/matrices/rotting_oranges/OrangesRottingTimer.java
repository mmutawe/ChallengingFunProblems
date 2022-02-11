package matrices.rotting_oranges;

// Given:
//      - a 2D array containing 0's (empty cell), 1's (fresh orange) and 2's (rotten orange).
//      - Evert minute, all fresh orange immediately adjacent (4 directions) to rotten oranges will rot.
// TODO - Required:
//      How many minutes must pass until all oranges will rot.
// Constrains:
//      - If there is no fresh oranges (or no oranges at all) then we return 0.
//      - If all the oranges can NOT rot, return -1.
//      - m == grid.length & n == grid[i].length
//          --> 1 <= m, n <= 30
public interface OrangesRottingTimer {
    int getFreshOrangesRottingTime(int[][] grid);
}
