package com.nick.leetcode;

import java.util.*;

class Solution1 {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        Arrays.sort(nums);
        int longestConsecutiveNumber = 1;
        int currentLongest = 1;
        Set<Integer> set = new HashSet<>();
        set.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                continue;
            } else {
                set.add(nums[i]);
            }
            if (nums[i] - nums[i-1] == 1) {
                currentLongest++;
            } else {
                currentLongest = 1;
            }

            if (currentLongest > longestConsecutiveNumber) {
                longestConsecutiveNumber = currentLongest;
            }
        }
        return longestConsecutiveNumber;
    }

    public static void main(String[] args) {
        int[] testCase = new int[] {1,2,0,1};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.longestConsecutive(testCase));
    }
}
