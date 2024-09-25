package September.twentyFifth;

import java.util.Stack;

public class TeemoAttacking {
    public static void main(String[] args) {
//        https://leetcode.com/problems/teemo-attacking/
        //3ms
//        int[] timeSeries = {1, 2, 3, 4, 5};
        int duration=2;
        int[] timeSeries = {1, 4};
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < timeSeries.length; i++) {
            int time = timeSeries[i];

            for (int j = time; j < time + duration; j++) {
                if (timeSeries.length>i+1&&timeSeries[i + 1] == j) {
                    break;
                }st.add(j);
            }
        }
        System.out.println("st = " + st);

    }
}
