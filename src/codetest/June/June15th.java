package codetest.June;

import java.util.Arrays;

public class June15th{
    public static void main(String[] args) {
//        Input: pref = [5,2,0,3,1]
//        Output: [5,7,2,3,2]
//        Explanation: From the array [5,7,2,3,2] we have the following:
//        - pref[0] = 5.
//                - pref[1] = 5 ^ 7 = 2.
//                - pref[2] = 5 ^ 7 ^ 2 = 0.
//                - pref[3] = 5 ^ 7 ^ 2 ^ 3 = 3.
//                - pref[4] = 5 ^ 7 ^ 2 ^ 3 ^ 2 = 1.
//
        int[] pref = {5, 2, 0, 3, 1};
//        if (pref.length == 1) {
//            System.out.println("pref[0] = " + pref[0]);
//
//        }
//        int[] arr = new int[pref.length];
//        arr[0] = pref[0];
//        for (int i = 1; i < pref.length; i++) {
//            arr[i] = (arr[i - 1] ^ pref[i]);
//        }
//        System.out.println(Arrays.toString(arr) );
        int meep = 7^2;
        System.out.println(meep);
    }
}
