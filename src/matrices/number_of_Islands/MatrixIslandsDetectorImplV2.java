package matrices.number_of_Islands;

import java.util.Arrays;

public class MatrixIslandsDetectorImplV2 implements MatrixIslandsDetector {

    // Optimal Solution
    // Time: O(n), Space: O(1)
    @Override
    public int getNumOfIslands(char[][] grid) {

        int islandsCounter = 0;

        // Sequential iteration
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == '1') {
                    islandsCounter++;
                    discoverIslands(x, y, grid);
                }
            }
        }
        return islandsCounter;
    }

    // Using DFS
    public void discoverIslands(int indexX, int indexY, char[][] grid) {

        if (indexX > grid[0].length - 1 || indexX < 0 ||
                indexY > grid.length - 1 || indexY < 0 ||
                grid[indexY][indexX]=='0') {
            return;
        }

        grid[indexY][indexX] = '0';

        discoverIslands(indexX - 1, indexY, grid);
        discoverIslands(indexX, indexY + 1, grid);
        discoverIslands(indexX + 1, indexY, grid);
        discoverIslands(indexX, indexY - 1, grid);
    }
}
