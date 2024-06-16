package com.nick.leetcode;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> response = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = 0 - nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == target) {
                    List<Integer> result = new ArrayList<>();
                    result.add(nums[i]);
                    result.add(nums[left]);
                    result.add(nums[right]);
                    response.add(result);
                    while (left < right && nums[left] == nums[left+1]) {
                        left++;
                    }
                    left++;
                    while (left < right && nums[right] == nums[right-1]) {
                        right--;
                    }
                    right--;
                } else if (nums[left] + nums[right] > target) {
                    right--;
                } else {
                    left++;
                }

            }
        }
        return response;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int[] nums = new int[]{0,0,0,0};
        System.out.println(solution.threeSum(nums));
    }
}
