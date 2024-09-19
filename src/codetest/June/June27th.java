package codetest.June;

import java.util.Arrays;

public class June27th {
    public static void main(String[] args) {
       int[][] mat =
               {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1}};
        int k = 3;
//        Output: [2,0,3]
        int[] rowss = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; i++) {
                if (mat[i][j] == 1) {
                    rowss[i]+=1;
                }
            }
        }

        System.out.println(Arrays.stream(rowss).sorted());
    }
}
