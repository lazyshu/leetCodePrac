package September.Twenty_Sliding_Window;

public class Longer_contiguous_segments_of_ones_than_zeros_easy {
//    https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/description/
    public static void main(String[] args) {
        String s = "11100";
//        Output: true

        // 12ms
        int num = s.charAt(0)-'0';
        int maxOne=0;
        int maxZero=0;
        int count=1;
        for (int i = 1; i < s.length(); i++) {
            int currentNum = s.charAt(i)-'0';
            if (num == currentNum) {
                count++;
                System.out.println("count = " + count);
            } else {
                if (num == 1) {
                    maxOne = Math.max(maxOne, count);
                } else {
                    maxZero = Math.max(maxZero, count);
                }
                count=1;
                num = currentNum;
            }
        }
        if (num == 1) {
            maxOne = Math.max(maxOne, count);
        } else {
            maxZero = Math.max(maxZero, count);
        }

        boolean answer = maxOne > maxZero ? true : false;

//// 0ms-
//        int maxOne=0,maxZero=0;
//        int left=0;
//        int right = s.length();
//        int countOne=0,countZero=0;
//        while (left < right) {
//            if (s.charAt(left) == '1') {
//                countOne++;
//                maxOne = Math.max(maxOne, countOne); //하나씩 올릴떄마다 Math.max로 체크해줘도 시간이 많이 안걸리나봉가
//                countZero=0;
//                left++;
//            }else{
//                countZero++;
//                maxZero = Math.max(maxZero, countZero);
//                countOne=0;
//                left++;
//            }
//        }
//        boolean answer = maxOne > maxZero ? true : false;
//        System.out.println(answer);



    }

}
