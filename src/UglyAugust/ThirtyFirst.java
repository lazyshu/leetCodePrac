package UglyAugust;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ThirtyFirst {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
//        Output: [1,3,12,0,0]
        if (nums.length == 1) {
            System.out.println("nums = " + nums);
        }










//        String str1= "ABABAB";
//        String str2 = "ABAB";
//        System.out.println(meep(str1,str2));
//
//    }
//    public static String meep(String str1, String str2){
////str1 길이가 더 짧을땐 str2로 바꿔줌
//        //1= ababab(str1)-abab(str2)= (st1)ab, str2=abab
//        //2= meep(ab,abab)-> str1길이가 더 짧으니 swap해서 다시 meep 메서드 호출 meep(abab,ab)
//        //3= abab-ab= ab, ab meep(ab,ab)
//        //4=ab-ab="", ab      meep("",ab)
//        //swap meep(ab,"");
//        if (str1.length() < str2.length()) {
//            return meep(str2, str1);
//        } else if (!str1.startsWith(str2)) {
//            return "Wrong";
//        } else if (str2.isEmpty()) {
//            return str1;
//        } else  {
//            return meep(str1.substring(str2.length()),str2);
//        }
    }
}
