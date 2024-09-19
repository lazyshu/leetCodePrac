package September.Twenty_Sliding_Window;

public class Max_Consecutive_ones_easy {
    public static void main(String[] args) {
//        https://leetcode.com/problems/max-consecutive-ones
        int[] nums = {1, 1, 0, 1, 1, 1};
//        Output: 3
        int right=0;
        int left=0;
        int max=0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                max = Math.max(max, right - left);
                left = right + 1;
            }
            right++;
        }
        System.out.println("Math.max(max,right-left) = " + Math.max(max,right-left));
    }
}
