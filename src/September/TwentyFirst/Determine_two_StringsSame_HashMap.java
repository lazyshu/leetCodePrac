package September.TwentyFirst;

import java.util.*;

public class Determine_two_StringsSame_HashMap {
//    https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75
    public static void main(String[] args) {

        //75ms
        String word1 = "abbzccc", word2 = "babzzcz";
        int wordLength = word1.length();
        if(wordLength!=word2.length())System.out.println(false);
        if (word1.equals(word2)) System.out.println(true);

        Map<Character, Integer> hm1= new HashMap<>();
        Map<Character, Integer> hm2= new HashMap<>();
        for(int i=0;i<wordLength;i++){
            char one = word1.charAt(i);
            hm1.put(one,hm1.getOrDefault(one,0)+1);
            char two = word2.charAt(i);
            hm2.put(two,hm2.getOrDefault(two,0)+1);

        }
        System.out.println("hm1 = " + hm1.entrySet());
        System.out.println("hm2 = " + hm2.entrySet());
        List<Integer> li1 = new ArrayList<>();
        List<Integer> li2 = new ArrayList<>();
        Integer[] arr1 = new Integer[wordLength];
        arr1 = hm1.values().toArray(new Integer[0]);
        Arrays.sort(arr1);

        Integer[] arr2 = new Integer[wordLength];
        arr2 = hm2.values().toArray(new Integer[0]);
        Arrays.sort(arr2);
        if (Arrays.toString(arr1).equals(Arrays.toString(arr2))) {
            System.out.println("true");
        }else System.out.println("false");
    }
}
