package September.TwentyFirst;

public class LongestSubarray_SlidingWindow {
//    https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75
public static void main(String[] args) {
    int[] nums = {1, 1, 0, 1};
//    Output: 3
    int left=0;
    int right=0;
    int count=0;
    boolean zero=false;
    int max=0;
    while(right<nums.length){
        if(zero==true&&nums[right]==0){
            right=left;
            max=Math.max(max,count);
            count=0;
            zero=false;
            continue;

        }
        if(nums[right]==0){
            zero=true;
            right++;
            left=right;
            continue;
        }


        count++;
        right++;
    }
    if(zero==false)count--;
    System.out.println(Math.max(max,count));
    }
}
