package codetest.June;

import java.util.Arrays;

public class June14th {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int group = nums.length / 3; //2
        int[] results = new int[nums.length];
        int k=0;

        for (int i = 0; i < n; i++) { //3 times
            int m=i;
            for (int j = 0; j < group; j++) { //2 times

                results[k] = nums[m];  // 0,0   1,3
                m += n;
                k++;
            }
        }
        System.out.println(Arrays.toString(results));
    }
}
