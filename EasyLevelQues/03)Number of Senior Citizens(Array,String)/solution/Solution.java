public class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for (int i = 0; i < details.length; i++) {
            int age = (details[i].charAt(11) - '0') * 10 + (details[i].charAt(12) - '0');
            if (age > 60) ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        System.out.println("Number of seniors: " + solution.countSeniors(details));
    }
}
