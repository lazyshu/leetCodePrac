package codetest.June;

import java.util.Arrays;

public class June11th {
    public static void main(String[] args) {
        int[][] grid = {{3,2},{1,0}};
        int[] array = new int[grid.length * grid[1].length];
        int k=0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                array[k] = grid[i][j];
                k++;
            }
        }
        Arrays.sort(array);
        int left=0;
        int right= array.length-1;
        int mid=0;
        while (left <= right) {
            mid= left+ (right-left)/2;
            if (array[mid] > 0 && array[mid - 1] < 0) {
                System.out.println("mid = " + mid);
                break;
            } else if (array[mid] < 0) {
                right=mid+(right-mid)/2;
                left=mid+1;
            } else {
                right=mid;
            } //mid>0 mid-1>0

        }
        System.out.println(mid);
    }
}