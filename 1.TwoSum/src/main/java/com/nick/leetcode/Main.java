package com.nick.leetcode;

public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,-2,-3,-4,-5};
        int target = -8;
        Solution solution = new Solution();
        int[] ints = solution.twoSum(nums, target);
        System.out.print("[");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i != ints.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}