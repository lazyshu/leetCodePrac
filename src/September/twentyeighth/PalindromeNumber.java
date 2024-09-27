package September.twentyeighth;

public class PalindromeNumber {
    //https://leetcode.com/problems/palindrome-number/
    public static void main(String[] args) {
        int b = 121;
        int bb=b;
        int t,s=0;
        while (bb != 0) {
            t = bb % 10; // t= 1
            s=s*10+t; //1
            bb /= 10;
        }
        if (s == b) {
            System.out.println("true = " + true);
        }

        //361ms
//        int x = b;
//        if(x<0){
//            System.out.println(false);
//
//        }
//        int reversedX = 0;
//        while (x > 9) {
//            reversedX =reversedX*10+x % 10;
//            x /= 10;
//            System.out.println("x = " + x);
//            System.out.println("reversedX = " + reversedX);
//
//        }
//        reversedX =reversedX*10+x % 10;
//        if (reversedX == b) {
//            System.out.println("true = " + true);
//        }
    }
}
