package codetest.June;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class June17th {
    public static void main(String[] args) {
        List<List<String>> items= Arrays.asList(
                Arrays.asList("phone","blue","pixel"),
                Arrays.asList("computer","silver","lenovo"),
                Arrays.asList("phone","gold","iphone")
        );
        int count=0;
        String ruleKey= "color";
        String ruleValue= "silver";
        int type= ruleKey.equals("type")? 0 : ruleKey.equals("color") ? 1 : 2;
        for (List<String> meep: items) {
            if (meep.get(type).equals(ruleValue)) {
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
