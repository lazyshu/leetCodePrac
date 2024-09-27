package September.twentysixth;

import java.util.LinkedList;
import java.util.Queue;

public class Dota2Senate {
    public static void main(String[] args) {
        String senate = "RDD";
//        Output: "Dire", "radient"
        Queue<Character> qu = new LinkedList<>();
        String prev = "";
        qu.add(senate.charAt(0));
        for (int i = 1; i <senate.length(); i++) {
            if (qu.peek().equals(senate.charAt(i))) {
                break;
            } else {
                if (i == senate.length() - 1) {
                    break;
                }
                qu.poll();

            }

        }
        String ans = qu.peek().equals("R") ? "Radient" : "Dire";
        System.out.println(ans);
    }
}
