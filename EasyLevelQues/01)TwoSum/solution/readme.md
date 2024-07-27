# Two Sum Solution in Java

## Overview

This Java solution to the "Two Sum" problem utilizes a `HashMap` to efficiently find two indices in an integer array such that their values sum up to a given target. 

### How It Works

1. **Initialize a HashMap**: A `HashMap` is used to store each number and its index as we iterate through the array.

2. **Iterate Through the Array**: For each element in the array, calculate the difference between the target and the current element.

3. **Check for Complement**: Check if this difference (complement) exists in the `HashMap`. If it does, the indices of the complement and the current element form the solution.

4. **Store Index**: If the complement is not found, store the current element and its index in the `HashMap`.

5. **Return Result**: If a valid pair is found, return their indices. If no such pair exists by the end of the array, throw an exception.

This approach ensures that the solution is found in linear time, making it efficient for large arrays.
