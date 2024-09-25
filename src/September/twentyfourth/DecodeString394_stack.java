package September.twentyfourth;

import java.util.Stack;

public class DecodeString394_stack {
    public static void main(String[] args) {
//        String s = "3[a]2[bc]";
        String s = "3[a2[c]]"; //"accaccacc"

        String answer = repeat(s,0);

        System.out.println("answer = " + answer);


    }

    public static String repeat(String s,int index) {
            int num=s.charAt(index)-'0';
           index+=2;
        String st = "";
                while (index<s.length()) {
                    char c = s.charAt(index);
                    if (s.charAt(index)>='a'&&s.charAt(index)<='z'){
                        st += c;
                    }else if (c == ']') {
                        System.out.println(st.repeat(num));
                        st = st.repeat(num);
                        return st;
                    } else if (c>='0'&&c<=9) {
                        st+=repeat(s,++index);
                    }
                     index++;
                }

                return st;


    }
}
