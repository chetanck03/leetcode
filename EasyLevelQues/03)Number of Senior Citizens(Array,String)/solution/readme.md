## Explanation

### Parameters:

- **String[] details**: An array of strings where each string contains personal details including the age of the individual.

### Return:

- **int**: The total number of people with an age greater than 60.

### Functionality:

1. Initializes a counter `ans` to 0.
2. Iterates through each entry in the `details` array.
3. Extracts the age from the string by accessing specific character positions (11th and 12th) and converts it to an integer.
4. Checks if the extracted age is greater than 60. If true, increments the counter.
5. Returns the total count of seniors.
