package matrices.distance_to_gate;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class EmptyNodesToGateDistanceCalculatorImpl implements EmptyNodesToGateDistanceCalculator {

    @Override
    public int[][] getMatrixDistanceToGates(int[][] grid) {

        List<Point> gateList = new ArrayList<>();
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[0].length; x++) {
                if (grid[y][x] == 0) {
                    gateList.add(new Point(x, y));
                }
            }
        }

        for (Point gate : gateList) {
            buildDistanceToGatesMatrix(grid, new Point(gate.x + 1, gate.y), 1);
            buildDistanceToGatesMatrix(grid, new Point(gate.x - 1, gate.y), 1);
            buildDistanceToGatesMatrix(grid, new Point(gate.x, gate.y + 1), 1);
            buildDistanceToGatesMatrix(grid, new Point(gate.x, gate.y - 1), 1);
        }

        return grid;
    }

    private void buildDistanceToGatesMatrix(int[][] grid, Point point, int distance) {
        int x = point.x;
        int y = point.y;

        if (x < 0 || x > grid[0].length - 1 ||
                y < 0 || y > grid.length - 1 ||
                grid[y][x] == -1 || grid[y][x] == 0 || grid[y][x] < distance) {
            return;
        }

        grid[y][x] = distance;

        buildDistanceToGatesMatrix(grid, new Point(point.x + 1, point.y), distance + 1);
        buildDistanceToGatesMatrix(grid, new Point(point.x - 1, point.y), distance + 1);
        buildDistanceToGatesMatrix(grid, new Point(point.x, point.y + 1), distance + 1);
        buildDistanceToGatesMatrix(grid, new Point(point.x, point.y - 1), distance + 1);
    }
}
