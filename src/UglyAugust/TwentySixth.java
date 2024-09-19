package UglyAugust;

import java.util.*;

public class TwentySixth {
    public static void main(String[] args) {
        int count=0;
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        List<Integer> li = new ArrayList<>();
        for (int a : scoville) {
            li.add(a);
        }
        for (int i = 0; i < li.size()-1; i++) {
            if (li.get(i) >= k) {
                break;
            }
           int a= li.get(i)+(li.get(i+1)*2);
            count++;
            li.removeFirst();
            li.set(i, a);
            System.out.println("li = " + li);

            Collections.sort(li);
        }
        System.out.println("count = " + count);

////        s	answer
////        "()()"	true
////        "(())()"	true
////        ")()("	false
////        "(()("	false
//        String s = "(()(";
//        Stack<Character> st = new Stack<>();
//        int open=0;
//        for (int i = 0; i < s.length(); i++) {
//            st.add(s.charAt(i));
//        }
//        for (Character a : st) {
//            if (a.equals('(')) {
//                open++;
//            } else {
//                if (open == 0) {
//                    System.out.println(" false");
//                } else {
//                    open--;
//                }
//            }
//
//        }
//        if (open > 0) {
//            System.out.println("false");
//        }
    }
}
