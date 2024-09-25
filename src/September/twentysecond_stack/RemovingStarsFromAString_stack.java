package September.twentysecond_stack;

import java.util.Arrays;
import java.util.Stack;

public class RemovingStarsFromAString_stack {
    public static void main(String[] args) {
//        https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75

        //이건 릿코드에 있던 방식! 8ms :(
        String s = "leet**cod*e";
        int len = s.length();
        byte[] res = new byte[len];
        s.getBytes(0,len,res,0);
        System.out.println(Arrays.toString(res));
        int countStars = 0;
        for(int i = 0; i<len; i++) {
            if (res[i] == '*') {
                countStars++;
            } else {
                System.out.println("res = " + res[i]);
                System.out.println("i =" + i + " \ncountStar =" + countStars + "\ni-countStars*2 = " + (i - countStars * 2));
                System.out.println();
                res[i - countStars * 2] = res[i];

            }
        }
        System.out.println(new String(res, 0, len-countStars*2));


//          459ms
//        Stack<Character> st = new Stack<>();
//        String a = "";
//        int star=0;
//        for (int i = s.length()-1; i >=0 ; i--) {
//            char c = s.charAt(i);
//            if (c=='*'){
//                star++;
//                continue;
//            }
//            if(star>0){
//                star--;
//                continue;
//            }
//
//            a = c +a;
//        }return a;

    }
}
