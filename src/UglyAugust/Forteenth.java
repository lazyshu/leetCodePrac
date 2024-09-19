package UglyAugust;

import java.util.ArrayList;
import java.util.List;

public class Forteenth {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 4;
        List<Integer> meep = new ArrayList<>();
        for (int i=0; i<nums.length;i++) {
            if (nums[i] == target) {
                System.out.println("i = " + i);
                break;
            }
        }
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] < target && nums[i + 1] > target) {
                System.out.println(i+1);
            }
        }


    }
}
