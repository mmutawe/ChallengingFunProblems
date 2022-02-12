package matrices.rotting_oranges;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;

public class OrangesRottingTimerImpl implements OrangesRottingTimer {

    // Time: O(n), Space: O(n)
    @Override
    public int getFreshOrangesRottingTime(int[][] grid) {

        int freshOrangeCounts = 0;
        Queue<Point> rottenOrangeQueue = new LinkedList();
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 1) {
                    freshOrangeCounts++;
                }
                if (grid[y][x] == 2) {
                    rottenOrangeQueue.add(new Point(x, y));
                }
            }
        }

        if (freshOrangeCounts == 0) {
            return 0;
        }

        int rottingTimer = 0;
        while (!rottenOrangeQueue.isEmpty()) {

            int freshOrangeCountsBeforeRotting = freshOrangeCounts;
            int numNextRottingOranges=rottenOrangeQueue.size();
            for (int i = 0; i < numNextRottingOranges; i++) {
                Point currRot = rottenOrangeQueue.poll();
                int x = currRot.x;
                int y = currRot.y;

                if (y - 1 >= 0 && grid[y - 1][x] == 1) {
                    grid[y - 1][x] = 2;
                    rottenOrangeQueue.add(new Point(x,y-1));
                    freshOrangeCounts--;
                }
                if (y + 1 < grid.length && grid[y + 1][x] == 1) {
                    grid[y + 1][x] = 2;
                    rottenOrangeQueue.add(new Point(x,y+1));
                    freshOrangeCounts--;
                }
                if (x - 1 >= 0 && grid[y][x - 1] == 1) {
                    grid[y][x - 1] = 2;
                    rottenOrangeQueue.add(new Point(x-1,y));
                    freshOrangeCounts--;
                }
                if (x + 1 < grid[0].length && grid[y][x + 1] == 1) {
                    grid[y][x+1] = 2;
                    rottenOrangeQueue.add(new Point(x+1,y));
                    freshOrangeCounts--;
                }
            }
            if (freshOrangeCountsBeforeRotting > freshOrangeCounts){
                rottingTimer++;
            }
        }

        if (freshOrangeCounts > 0){
            return -1;
        }
        return rottingTimer;
    }
}
