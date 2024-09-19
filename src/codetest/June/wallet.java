package codetest.June;

import java.util.ArrayList;

public class wallet {
    public static void main(String[] args) {
        int[][] sizes = new int[][]{{60, 50}, {30, 70}};
        int max=0;
        int secondMax=0;
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][1]>sizes[i][0]){
                int tmp= sizes[i][0];
                sizes[i][0] =sizes[i][1];
                sizes[i][1] = tmp;
            }
            if(sizes[i][0]>max){
                max=sizes[i][0];
            }
            if(sizes[i][1]>secondMax){
                max=sizes[i][1];
            }
        }
        int answer = secondMax * max;
        System.out.println("answer = " + answer);

    }
}
