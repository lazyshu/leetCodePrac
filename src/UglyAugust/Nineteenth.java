package UglyAugust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Nineteenth {
    public static void main(String[] args) {
        String word = "  the    sky is blue";
        StringBuffer st = new StringBuffer();
        List<String> li = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==' ')continue;
            st.append(word.charAt(i));
        }
        System.out.println("li = " + li);



//        StringBuilder st= new StringBuilder();
//        int one=word1.length();
//        int two= word2.length();
//        for(int i=0;i<Math.min(one,two);i++){
//            st.append(word1.charAt(i));
//            st.append(word2.charAt(i));
//        }
//        if(one>two){
//            st.append(word1.substring(two,one));
//        }
//        if(two>one){
//            st.append(word2.substring(one,two));
//        }
//        return st.toString();
    }
}
