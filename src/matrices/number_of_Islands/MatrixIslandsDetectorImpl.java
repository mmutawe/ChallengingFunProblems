package matrices.number_of_Islands;

import java.util.Arrays;

public class MatrixIslandsDetectorImpl implements MatrixIslandsDetector {

    // Time: O(n), Space: O(n) --> n = all nodes (x * y)
    @Override
    public int getNumOfIslands(char[][] grid) {
        Boolean[][] seenMatrix = new Boolean[grid.length][grid[0].length];

        for (Boolean[] arr : seenMatrix) {
            Arrays.fill(arr, false);
        }

        int islandsCounter = 0;
        // Sequential iteration
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (!seenMatrix[y][x] && grid[y][x] == '1') {
                    islandsCounter++;
                    discoverIslands(x, y, grid, seenMatrix);
                }
            }
        }
        return islandsCounter;
    }

    // Using DFS
    public void discoverIslands(int indexX, int indexY, char[][] grid, Boolean[][] seenMatrix) {

        if (indexX > grid[0].length - 1 || indexX < 0 ||
                indexY > grid.length - 1 || indexY < 0 ||
                seenMatrix[indexY][indexX] ||
                grid[indexY][indexX]=='0') {
            return;
        }

        seenMatrix[indexY][indexX] = true;

        discoverIslands(indexX - 1, indexY, grid, seenMatrix);
        discoverIslands(indexX, indexY + 1, grid, seenMatrix);
        discoverIslands(indexX + 1, indexY, grid, seenMatrix);
        discoverIslands(indexX, indexY - 1, grid, seenMatrix);
    }
}
