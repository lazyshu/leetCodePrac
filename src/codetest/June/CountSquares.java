//package codetest;
//
//import java.util.Arrays;
//
//public class CountSquares {
//    public static void main(String[] args) {
//        int[][] matrix = {
//                {0, 1, 1, 1}, {1, 1, 1, 1}, {0, 1, 1, 1}
//        };
//        int result = 0;
//        int side = 1;
//
//            for (int i = 0; i < matrix.length; i++) { //4 times
//                for (int j = 0; j < matrix[0].length; j++) {
//                        if (matrix[i][j] == 1) {
//                            result += 1;
//                        }
//                    }
//
//            }side++;
//        System.out.println("result = " + result);
//        if (side > 1) {
//
//
//            for (int i = 0; i < matrix.length; i++) {
//                boolean flag = true;
//                for (int j = 0; j < matrix[0].length; j++) {//0.1
//                    if (matrix[i][j] == 1){
//                        continue;
//                    }
//                    if (side + i-1 >= matrix.length || side + j-1 >= matrix[0].length) {
//                        continue;
//                    }
//                    for (int first = 0; first < side; first++) {//side==2 first 1,2
//                        for (int second = 0; second < side; second++) { //second 1,2
//                            if (matrix[i + first][j + second] != 1){
//                                flag=false;
//                                break;
//                        }
//                        }
//
//                } if (flag==true) {
//                        result += 1;
//                    }
//                side++;
//            }
//        }System.out.println("result = " + result);
//    }
//}