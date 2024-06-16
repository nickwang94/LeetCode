package com.nick.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length <= 1) {
            return;
        }
        int left = 0, right = 0;
        int n = nums.length;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[] {0, 0};
        solution.moveZeroes(nums);
        System.out.println(nums);
    }
}
