package codetest.June;

import java.util.Arrays;

public class June14th_mid {




    public static void main(String[] args) {

        int[][] input = {{1, 2, 1}, {4, 3, 4}, {3, 2, 1}, {1, 1, 1},{0,2},{0,0,3,2,5},{0,2},{3,1},{3,0,3,2,10},{3,1},{0,2}};

        int[][] rectangle = new int[4][input[0].length];
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[0].length; j++) {
                rectangle[i][j] = input[i][j];
            }
        }
        System.out.println(Arrays.deepToString(rectangle));

        int row=0;
        int col=2;
        System.out.println(rectangle[row][col]);

//        int row1=0;
//        int col1=0;
//        int row2=3;
//        int col2=2;
//        int newValue=5;
//        for (int i = row1; i <= row2; i++) {
//            for (int j = col1; j <= col2; j++) {
//                rectangle[i][j] = newValue;
//            }
//        }
//        System.out.println(Arrays.deepToString(rectangle));
    }

//    private void SubrectangleQueries(int[][] rectangle) {
//
//    }

    public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {

    }
//
//    public int getValue(int row, int col) {
//
//    }
}
