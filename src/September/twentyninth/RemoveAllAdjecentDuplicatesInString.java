package September.twentyninth;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveAllAdjecentDuplicatesInString {
//    https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
    public static void main(String[] args) {
        String s = "azxxzy"; //2,3->1,2

        //34ms :(
        Stack<Character> st = new Stack<>();
        st.add(s.charAt(0));
        int length = s.length();
        System.out.println("st = " + st);
        for (int i = 1; i < length; i++){
            char secondC = s.charAt(i);
            if (st.size()>0&&st.peek() == secondC) {
                st.pop();
               continue;
            }
            st.add(s.charAt(i));

        }
        StringBuilder sb = new StringBuilder();
        for (Character print : st) {
            sb.append(print);
        }
        System.out.println("sb.toString() = " + sb.toString());


    }
}
