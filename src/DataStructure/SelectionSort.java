package DataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] num = new int[N.length()];
        for (int i = 0; i < num.length; i++) {
            num[i] = N.charAt(i)-'0';
        }
        System.out.println("num = " + Arrays.toString(num));
        //14235
        for (int i = 0; i < num.length; i++) { //0,1,2,3,4
            int max = i;
            for (int j = i + 1; j < num.length; j++) { //1,2,3,4
                if (num[max]<num[j]) { //0<1, 1<2, 2<3, 3<4
                    max = j; //4,5
                }
            }

            if (num[max] > num[i]) {
                int tmp = num[i];
                num[i] = num[max];
                num[max] = tmp;
            }

        }

    }
}
