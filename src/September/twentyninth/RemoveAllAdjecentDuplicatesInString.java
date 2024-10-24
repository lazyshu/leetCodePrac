package September.twentyninth;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveAllAdjecentDuplicatesInString {
//    https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
    public static void main(String[] args) {
        String s = "azxxzy"; //2,3->1,2


        //6ms
//        int resIndex=0;
//        char[] res = new char[s.length()];
//        //char[]배열의 익덱스랑 s의 인덱스를 따로 두고
//        //리턴할때 char[]배열에 있는 답만 resIndex사용해서 쏙 뺴주기!!
//
//        for (int i = 0; i < s.length(); i++) {
//            res[resIndex] = s.charAt(i);
//            if (resIndex > 0 && res[resIndex] == res[resIndex - 1]) {
//                resIndex--;
//                System.out.println("resIndex = " + resIndex);
//            } else {
//                resIndex++;
//            }
//        }
//        System.out.println("res = " + String.valueOf(res, 0, resIndex));

//        //32ms :(
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
