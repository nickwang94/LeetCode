package com.nick.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> resultHashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (resultHashMap.containsKey(target - nums[i])) {
                return new int[] {i, resultHashMap.get(target - nums[i])};
            }
            resultHashMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
