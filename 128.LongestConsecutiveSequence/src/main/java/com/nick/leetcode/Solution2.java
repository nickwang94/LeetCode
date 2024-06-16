package com.nick.leetcode;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        Set<Integer> integerSet = new HashSet<>();
        for (int num : nums) {
            integerSet.add(num);
        }

        int longestNumber = 1;
        for (int num : integerSet) {
            int currentLongest = 1;
            if (!integerSet.contains(num - 1)) {
                int currentNumber = num;
                while (integerSet.contains(currentNumber + 1)) {
                    currentLongest++;
                    currentNumber++;
                }
                if (currentLongest > longestNumber) {
                    longestNumber = currentLongest;
                }
            }
        }
        return longestNumber;
    }

    public static void main(String[] args) {
        int[] testCase = new int[] {0,3,7,2,5,8,4,6,0,1};
        Solution2 solution = new Solution2();
        System.out.println(solution.longestConsecutive(testCase));
    }
}
