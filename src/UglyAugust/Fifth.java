package UglyAugust;

import java.util.ArrayList;
import java.util.List;

public class Fifth {
    public static void main(String[] args) {
        int[] arr = {-6, 2, 5, -2, -7, -1, 3};
        List<Integer> nums = new ArrayList<>();
        for (int a : arr) {
            nums.add(a);
        }
        for (int i = 0; i < nums.size() - 1; i++) {

        }
        int target=-2;
        int count=0;
        for (int i = 0; i < arr.length-1; i++) { //0,1,2,3,4,5
            System.out.println("i = " + i);
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("j = " + j);
                if ( (arr[i] + arr[j]) < target) {
                    count++;
                    System.out.printf("arr[ %d ] + arr[ %d ] =%d  < %d  ",i,j,(arr[i]+arr[j]),target);
                    System.out.println();
                }
            }
        }
        System.out.println("count = " + count);


//        Input: nums = [-1,1,2,3,1], target = 2
//        Output: 3
//        Explanation: There are 3 pairs of indices that satisfy the conditions in the statement:
//        - (0, 1) since 0 < 1 and nums[0] + nums[1] = 0 < target
//                - (0, 2) since 0 < 2 and nums[0] + nums[2] = 1 < target
//                - (0, 4) since 0 < 4 and nums[0] + nums[4] = 0 < target
//        Note that (0, 3) is not counted since nums[0] + nums[3] is not strictly less than the target.
//                Example 2:
//
//        Input: nums = [-6,2,5,-2,-7,-1,3], target = -2
//        Output: 10
//        Explanation: There are 10 pairs of indices that satisfy the conditions in the statement:
//        - (0, 1) since 0 < 1 and nums[0] + nums[1] = -4 < target
//                - (0, 3) since 0 < 3 and nums[0] + nums[3] = -8 < target
//                - (0, 4) since 0 < 4 and nums[0] + nums[4] = -13 < target
//                - (0, 5) since 0 < 5 and nums[0] + nums[5] = -7 < target
//                - (0, 6) since 0 < 6 and nums[0] + nums[6] = -3 < target
//                - (1, 4) since 1 < 4 and nums[1] + nums[4] = -5 < target
//                - (3, 4) since 3 < 4 and nums[3] + nums[4] = -9 < target
//                - (3, 5) since 3 < 5 and nums[3] + nums[5] = -3 < target
//                - (4, 5) since 4 < 5 and nums[4] + nums[5] = -8 < target
//                - (4, 6) since 4 < 6 and nums[4] + nums[6] = -4 < target
    }
}
