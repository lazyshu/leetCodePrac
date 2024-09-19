package codetest.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class June18th {
    public static void main(String[] args) {
        String s = "vttqexwqgdc";
        int[] indices = {9,5,8,0,4,3,6,10,1,2,7};
        String ind = "";
        char[] result = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            result[indices[i]] = s.charAt(i);
        }
        System.out.println(String.valueOf(result));

    }
}

