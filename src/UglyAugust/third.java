package UglyAugust;

import java.util.Arrays;

public class third {
    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 1};
        Arrays.sort(arr);
        int i=arr[arr.length - 1];
        int j=arr[arr.length - 2];
        System.out.println((i-1)*(j-1));

    }
}
