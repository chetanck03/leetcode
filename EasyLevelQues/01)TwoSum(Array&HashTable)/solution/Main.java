import java.util.HashMap;
import java.util.Map;

public class Main {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int remain = target - nums[i];

            if (map.containsKey(remain)) {
                return new int[] { map.get(remain), i };
            }

            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = main.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
