package Exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashEqualRowsColums {

    public static void main(String[] args) {
        int[][] grid = {
                { 3, 2, 1 },
                { 1, 7, 6 },
                { 2, 7, 7 }
        };
        int[][] grid2 = {
                { 3, 1, 2, 2 },
                { 1, 4, 4, 5 },
                { 2, 4, 2, 2 },
                { 2, 4, 2, 2 },
        };

        System.out.println(Arrays.toString(grid[0]));
        System.out.println(Arrays.toString(grid[2]));

        System.out.println(equalPairs(grid)); // Salida esperada: 1
        System.out.println(equalPairs(grid2)); // Salida esperada: 1
    }

    public static int equalPairs(int[][] grid) {

        int len = grid.length;
        Map<String, Integer> rowMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < len; i++) {
            String rowKey = Arrays.toString(grid[i]);
            rowMap.put(rowKey, rowMap.getOrDefault(rowKey, 0) + 1);
        }

        for (int j = 0; j < len; j++) {
            int[] col = new int[len];
            for (int i = 0; i < len; i++) {
                col[i] = grid[i][j];
            }
            String colKey = Arrays.toString(col);

            if (rowMap.containsKey(colKey)) {
                count += rowMap.get(colKey);
            }
        }
        return count;
    }

}
