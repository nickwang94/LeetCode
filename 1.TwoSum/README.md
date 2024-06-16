# Question

> Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
> You may assume that each input would have exactly one solution1, and you may not use the same element twice.
> You can return the answer in any order.

Example 1:
```bash
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
```

Example 2:
```bash
Input: nums = [3,2,4], target = 6
Output: [1,2]
```

Example 3:
```bash
Input: nums = [3,3], target = 6
Output: [0,1]
```

Constraints:
```bash
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
```

> Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?


# Solution
create a hashmap, and key is the number, value is the index.
go through the array in a for loop, get the current value form array, and check if hashmap contains the `target - current value`,
if yes, that means current value plus one value in hashmap equals target, then return current index and get the other index from hashmap via get `target - current value`.
if no, then put the num as key, and index as value into hashmap.
