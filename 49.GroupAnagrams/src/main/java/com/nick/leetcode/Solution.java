package com.nick.leetcode;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dictionary = new HashMap<>();
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);
            if (!dictionary.containsKey(key)) {
                dictionary.put(key, new ArrayList());
            }
            dictionary.get(key).add(word);
        }
        return new ArrayList<List<String>>(dictionary.values());
    }
}
