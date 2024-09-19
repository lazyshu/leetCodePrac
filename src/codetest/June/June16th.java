package codetest.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class June16th {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';
        List<Integer> result= new ArrayList<>();
        int index=0;
    for (int i = 0; i <words.length; i++) {
                if (words[i].indexOf(x)>=0) {
                    result.add(i);
                    index++;
                }
        }
        System.out.println(result);
    }


}
