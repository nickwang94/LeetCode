package com.nick.leetcode;

public class Soluiton2 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxAreaValue = 0;
        while (left < right) {
            int currentValue = Math.min(height[left], height[right]) * (right - left);
            maxAreaValue = Math.max(currentValue, maxAreaValue);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxAreaValue;
    }

    public static void main(String[] args) {
        int[] height = new int[] {1,8,6,2,5,4,8,3,7};
        Soluiton2 solution = new Soluiton2();
        System.out.println(solution.maxArea(height));
    }
}
