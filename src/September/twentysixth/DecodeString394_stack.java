package September.twentysixth;

import java.util.Stack;

public class DecodeString394_stack {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
//        String s = "2[abc]3[cd]ef";

//        Output: "abcabccdcdcdef"
        Stack<Character> result = new Stack<>();
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==']'){
                i++;
                StringBuilder st = new StringBuilder();
                while (i<s.length()&&s.charAt(i) != '[') {
                    st.append(result.pop());
                    i++;
                }
                int count=0;
               i++;
                System.out.println("s = " + s.charAt(i));
                while (i<s.length()&&Character.isDigit(s.charAt(i))) {

                    count = count * 10 + s.charAt(i);

                    i++;
                }
                String torepeat = st.toString();
                for (int j = 0; j < count; j++) {
                    st.append(torepeat);
                }
                newString = st.toString();

            }else {
                result.add(s.charAt(i));
            }
        }
        System.out.println(newString);
    }
}
