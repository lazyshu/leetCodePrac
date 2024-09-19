package UglyAugust;

import DataStructure.Que;

import java.util.*;

public class Twentieth {
    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        Queue<Integer> st = new LinkedList<>();
        int pointer=0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == sandwiches[pointer]) {
                pointer++;
            } else {
                st.add(students[i]);
            }
        }
        //size동안 안바뀌었다면! 스톱엔 리턴!
        System.out.println("st = " + st);
        System.out.println("pointer = " + pointer);
        int change=-1;
        int changeCount=-1;
        while(!st.isEmpty()){
            int pop = st.poll();
            if (change == pop) { // 1
                changeCount++;
            }else change = pop;

            if (changeCount >= st.size()) {

                System.out.println("st.size() = " + st.size()+1);
                break;
            }
            if (pop == sandwiches[pointer]) {
                pointer++;
            } else {
                st.add(pop);
            }
        }




//       int[] nums = {1,2,5,2,3};
//        int target = 2;
//
//        Arrays.sort(nums);
//        List<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > target) {
//                break;
//            }
//            if (nums[i] == target) {
//                result.add(i);
//            }
//        }
//        System.out.println("result = " + result);
    }
}
