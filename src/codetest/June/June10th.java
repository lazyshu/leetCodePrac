package codetest.June;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class June10th {
    public static void main(String[] args) {
      int n=3;
        int[] times = {10, 7};
        Arrays.sort(times);
        System.out.println("Arrays.toString(times) = " + Arrays.toString(times));
        //7*6==42
        //10-7==3
        if (n == 1) {
            System.out.println(times[0]);
        }
        int higer=2;
        int i=0;
        int minutes = times[i];
        n--;
        int j=1;
        while (n>0) {

            if (times[i] * higer <= times[i + j]) { //5*2= 10 >10
                minutes += times[i];
            } else{
                minutes += times[i + j];

            }
            n--;
        }
        System.out.println("minutes = " + minutes);
    }
}
