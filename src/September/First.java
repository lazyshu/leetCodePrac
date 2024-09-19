package September;

import java.util.*;
import java.util.stream.Collectors;

public class First {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k=3;


        List<Character> li= new ArrayList<>();
        li.add('a');
        li.add('e');
        li.add('i');
        li.add('o');
        li.add('u');
        int count=0;
        int left=0;
        int max=0;
        for(int i=0;i<k;i++){
            if(li.contains(s.charAt(i))){
                count++;

            }
            max=count;
        }
        for(int i=k;i<s.length();i++){
            if(li.contains(s.charAt(i))){
                count++;
                System.out.println("s = " + s.charAt(i));
                System.out.println("count = " + count);
            }
            if(li.contains(s.charAt(left))){
                count--;
                left++;
            }
            max=Math.max(max,count);
        }


        System.out.println("max = " + max);
    }
}
