package September.twentysixth;

import java.util.Stack;

public class DecodeString394_stack {
    public static void main(String[] args) {
        String s = "3[a2[c]]";
//        String s = "2[abc]3[cd]ef";

//        Output: "abcabccdcdcdef"
        Stack<String> result = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        String res = "";
        int index=0;
        while (index < s.length()) {
            //when it is a number
            char c = s.charAt(index);
            if (Character.isDigit(c)){
                int co=0;
                while (Character.isDigit(s.charAt(index))) {
                    co = co * 10 + s.charAt(index)-'0';
                    index++;
                }
                counts.push(co); //3,2,
            } else if (c == '[') {
                if (!res.equals("")) {
                    result.push(res); //"","a",
                    res = "";
                }

                index++;

            } else if (c == ']') {
                StringBuilder temp = new StringBuilder();
                int count = counts.pop(); //2 //3
                res = result.pop()+res;
                for (int i = 0; i < count; i++) {
                    temp.append(res);  //cc
                }
                res = temp.toString(); //res="cc"
                index++;
            } else {
                while (!Character.isDigit(s.charAt(index))&&s.charAt(index)!= '['&&s.charAt(index) != ']') {
                    res += c;
                    index++;
                }
                result.push(res);
                res = "";
            }
        }
        System.out.println("res = " + res);
    }
}
