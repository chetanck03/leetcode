public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        
        // Final check to update max for the last sequence of 1's
        max = Math.max(max, count);
        
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example test cases
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        
        System.out.println("Max consecutive ones in nums1: " + solution.findMaxConsecutiveOnes(nums1)); // Output: 3
        System.out.println("Max consecutive ones in nums2: " + solution.findMaxConsecutiveOnes(nums2)); // Output: 2
    }
}
