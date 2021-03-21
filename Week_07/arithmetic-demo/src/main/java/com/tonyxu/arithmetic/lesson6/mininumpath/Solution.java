package com.tonyxu.arithmetic.lesson6.mininumpath;

import java.util.logging.Logger;

/**
 * @author tonyxu
 */
public class Solution {

    private static final Logger logger = Logger.getLogger(Solution.class.getName());

    public static void main(String[] args) {
        int[][] nums = new int[][]{{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(new Solution().minPathSum(nums));
    }

    public int minPathSum(int[][] grid) {
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(i == 0 && j == 0) {
                    logger.info("continue");
                } else if(i == 0) {
                    grid[i][j] = grid[i][j - 1] + grid[i][j];
                } else if(j == 0) {
                    grid[i][j] = grid[i - 1][j] + grid[i][j];
                } else {
                    grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
                }
            }
        }
        return grid[grid.length - 1][grid[0].length - 1];
    }
}
