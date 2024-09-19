package UglyAugust;

public class TwentySecond {
    public static void main(String[] args) {
    String s = "01001010011110011010001101111111111011010110001110110111110111011101111000010000";
//        Output: "001"
        char a = s.charAt(0);
        int one=0;
        for (int i=0; i<s.length();i++) {
            if(s.charAt(i)=='1'){
                one++;
            }
        }
        System.out.println("one = " + one);
        String result = "";
        if (one == '0') {
            System.out.println(0);
        } else {
            for (int i=0;i<one-1;i++) {
                result += "1";
            }
            for (int i=0;i<s.length()-one;i++) {
                result += "0";
            }
            result+="1";
        }
        System.out.println("result = " + result);
    }
}
