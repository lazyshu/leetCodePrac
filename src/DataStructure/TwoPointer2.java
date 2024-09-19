package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TwoPointer2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(bufferedReader.readLine());
        int total = Integer.parseInt(bufferedReader.readLine());


        int count=0;
        int start_point=0;
        int end_point=num-1;
        int[] array = new int[num];
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 0; i < num; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
       Arrays.sort(array);
        while (start_point < end_point) {
            if ((array[start_point] + array[end_point]) < total) {
                start_point++;
            } else if (array[start_point] + array[end_point] > total) {
                end_point--;
            }else {
                count++;
                start_point++;
                end_point--;
            }
        }
        System.out.println("count = " + count);
    }
}
