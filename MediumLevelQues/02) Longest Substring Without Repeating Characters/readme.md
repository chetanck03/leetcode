# Longest Substring Without Repeating Characters

Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/


## Problem Statement

Given a string `s`, find the length of the longest substring without repeating characters.

### Examples

#### Example 1:
- **Input**: s = "abcabcbb"
- **Output**: 3
- **Explanation**: The answer is "abc", with the length of 3.

#### Example 2:
- **Input**: s = "bbbbb"
- **Output**: 1
- **Explanation**: The answer is "b", with the length of 1.

#### Example 3:
- **Input**: s = "pwwkew"
- **Output**: 3
- **Explanation**: The answer is "wke", with the length of 3.
  Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

### Constraints

- `0 <= s.length <= 5 * 10^4`
- `s` consists of English letters, digits, symbols, and spaces.

## Solution

We can use a sliding window approach with two pointers (`left` and `right`) to find the length of the longest substring without repeating characters. A `HashMap` is used to store the last seen index of each character.

### Java Implementation

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char currentChar = s.charAt(right);

            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }

            map.put(currentChar, right);
            
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
