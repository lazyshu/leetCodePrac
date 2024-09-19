package July;

import com.sun.source.doctree.SeeTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class July_22nd {
//    https://school.programmers.co.kr/learn/courses/30/lessons/1845?language=java
//        nums	     result
//        [3,1,2,3]    	2
//        [3,3,3,2,2,4]	3
//        [3,3,3,2,2,2]	2

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        Set<Integer> setNums = new HashSet<>();
        for (int a : nums) {
            setNums.add(a);
        }
        if (setNums.size() > nums.length / 2) {
            System.out.println("nums = " + nums.length / 2);
        } else {
            System.out.println("setNums = " + setNums.size());
        }
    }
}
