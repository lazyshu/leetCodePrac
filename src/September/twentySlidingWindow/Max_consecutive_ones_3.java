package September.twentySlidingWindow;

public class Max_consecutive_ones_3 {
    public static void main(String[] args) {
//        https://leetcode.com/problems/max-consecutive-ones-iii
        //힝구리퐁퐁 답은 외웠는데 복잡해서 이해는 못함.. :(
//        Input:
        int[] nums={1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
//        Output: 6
        int left=0;
        int right=0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                k--;
            }
            if (k < 0) {
                if (nums[left] == 0) {
                    k++;
                }
                left++;
            }
            right++;
        }
        System.out.println("answer = "+ (right - left));
    }
}
