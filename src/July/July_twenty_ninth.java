package July;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12906

public class July_twenty_ninth {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 4, 5};
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]  != arr[i]) {
                result.add(arr[i]);
            }
        }
        System.out.println("result = " + result.toString());
    }

}
