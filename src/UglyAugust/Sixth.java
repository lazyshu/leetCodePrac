package UglyAugust;

import java.util.Arrays;

public class Sixth {
    public static void main(String[] args) {
        int[][] nums={{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int length = 0, height = 0;
        for (int[] card : nums) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        System.out.println(" result =" + length* height);
//        int max=0;
//        int secondMax=0;
//
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i][0]>=nums[i][1]){
//                if (max < nums[i][0]) {
//                    max = nums[i][0];
//                }
//                if (nums[i][1]>secondMax) {
//                    secondMax = nums[i][1];
//                }
//            }else {
//                if (nums[i][1] > max) {
//                    max = nums[i][1];
//                }
//                if (nums[i][0]>secondMax) {
//                    secondMax = nums[i][0];
//                }
//            }
//        }
//        System.out.println(max*secondMax);
    }
}
