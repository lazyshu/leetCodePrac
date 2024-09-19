package July;

import java.util.*;
//https://leetcode.com/problems/valid-parentheses/

public class thirtieth {
    public static void main(String[] args) {
        class Solution {
            public boolean isValid(String s) {
                if(s.length()%2!=0){
                    return false;
                }
                HashMap<Character,Character> hm=new HashMap<>();
                hm.put('(',')');
                hm.put('{','}');
                hm.put('[',']');
                Stack<Character> stacky= new Stack<>();

                for(int i=0; i<s.length(); i++){
                    if(hm.containsKey(s.charAt(i))){
                        stacky.push(s.charAt(i));
                    }else{
                        if(stacky.isEmpty()||hm.get(stacky.peek()) != s.charAt(i)){
                            return false;
                        }
                        stacky.pop();
                    }
                }
                return stacky.isEmpty();
            }
        }

    }
}
