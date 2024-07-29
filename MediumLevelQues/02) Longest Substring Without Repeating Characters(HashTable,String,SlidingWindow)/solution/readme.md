# Longest Substring Without Repeating Characters

## Example Walkthrough

Let's walk through the example with the input `s = "pwwkew"` to find the length of the longest substring without repeating characters.

### Step-by-Step Explanation

1. **Initialization**:
   - `map` is an empty `HashMap` to store the last seen index of each character.
   - `left` is set to 0, representing the start of the current substring window.
   - `maxLength` is set to 0, to keep track of the longest substring without repeating characters.

2. **Iteration**:

   - **Step 1** (`right = 0`):
     - `currentChar = 'p'`.
     - `'p'` is not in `map`, so no need to update `left`.
     - Update `map` with `'p' -> 0`.
     - Calculate the length of the current substring: `right - left + 1 = 0 - 0 + 1 = 1`.
     - Update `maxLength` to 1.

     ```java
     map = {'p' -> 0}
     maxLength = 1
     ```

   - **Step 2** (`right = 1`):
     - `currentChar = 'w'`.
     - `'w'` is not in `map`, so no need to update `left`.
     - Update `map` with `'w' -> 1`.
     - Calculate the length of the current substring: `right - left + 1 = 1 - 0 + 1 = 2`.
     - Update `maxLength` to 2.

     ```java
     map = {'p' -> 0, 'w' -> 1}
     maxLength = 2
     ```

   - **Step 3** (`right = 2`):
     - `currentChar = 'w'`.
     - `'w'` is in `map` at index 1.
     - Update `left` to `max(left, map.get('w') + 1) = max(0, 1 + 1) = 2`.
     - Update `map` with `'w' -> 2`.
     - Calculate the length of the current substring: `right - left + 1 = 2 - 2 + 1 = 1`.
     - `maxLength` remains 2.

     ```java
     map = {'p' -> 0, 'w' -> 2}
     left = 2
     maxLength = 2
     ```

   - **Step 4** (`right = 3`):
     - `currentChar = 'k'`.
     - `'k'` is not in `map`, so no need to update `left`.
     - Update `map` with `'k' -> 3`.
     - Calculate the length of the current substring: `right - left + 1 = 3 - 2 + 1 = 2`.
     - `maxLength` remains 2.

     ```java
     map = {'p' -> 0, 'w' -> 2, 'k' -> 3}
     maxLength = 2
     ```

   - **Step 5** (`right = 4`):
     - `currentChar = 'e'`.
     - `'e'` is not in `map`, so no need to update `left`.
     - Update `map` with `'e' -> 4`.
     - Calculate the length of the current substring: `right - left + 1 = 4 - 2 + 1 = 3`.
     - Update `maxLength` to 3.

     ```java
     map = {'p' -> 0, 'w' -> 2, 'k' -> 3, 'e' -> 4}
     maxLength = 3
     ```

   - **Step 6** (`right = 5`):
     - `currentChar = 'w'`.
     - `'w'` is in `map` at index 2.
     - Update `left` to `max(left, map.get('w') + 1) = max(2, 2 + 1) = 3`.
     - Update `map` with `'w' -> 5`.
     - Calculate the length of the current substring: `right - left + 1 = 5 - 3 + 1 = 3`.
     - `maxLength` remains 3.

     ```java
     map = {'p' -> 0, 'w' -> 5, 'k' -> 3, 'e' -> 4}
     left = 3
     maxLength = 3
     ```

3. **Result**:
   - The longest substring without repeating characters is `"wke"`, with a length of 3.

## Conclusion

By using a sliding window technique with a `HashMap`, we can efficiently find the length of the longest substring without repeating characters. The `left` pointer adjusts dynamically to skip over previously seen characters, ensuring that the substring remains free of duplicates. The `maxLength` is updated to reflect the longest valid substring encountered during the iteration.
