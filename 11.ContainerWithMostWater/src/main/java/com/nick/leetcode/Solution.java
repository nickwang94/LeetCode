package com.nick.leetcode;

public class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int[][] dp = new int[n][n];
        for (int step = 1; step < n; step++) {
            for (int left = 0; left < n-step; left++) {
                int right = left + step;
                if (step == 1) {
                    initDp(dp, height, left, right);
                } else {
                    dp[left][right] = findMax(dp, height, left, right);
                }

            }
        }
        return dp[0][n-1];
    }

    private void initDp(int[][] dp, int[] height, int i, int j) {
        dp[i][j] = Math.min(height[i], height[j]);
    }

    private int findMax(int[][] dp, int[] height, int i, int j) {
        int tempMax = Math.max(dp[i][j-1], dp[i+1][j]);
        int finalMax = Math.max(tempMax, Math.min(height[i], height[j]) * Math.abs(j -i));
        return finalMax;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        Solution solution = new Solution();
        System.out.println(solution.maxArea(height));
    }
}
