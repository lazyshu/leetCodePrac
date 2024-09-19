package DataStructure;

import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 1;
        int end_point = 1;
        int start_point = 1;
        int sum = 1;

        while (end_point!= num) {
            if (num == sum) {
                count++;
                end_point++;
                sum += end_point;
            } else if (sum>num) {
                sum -= start_point;
                start_point++;
            } else end_point++;
            sum += end_point;
        }
        System.out.println("count = " + count);
    }
}
