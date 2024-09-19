package UglyAugust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Thirteenth {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) { //5times
            List<Integer> meep = new ArrayList<>();
            for (int j = 0; j <= i; j++) { //i times
                if (j == 0|| i==j) {
                    meep.add(1);
                    continue;
                }
                int a = result.get(i - 1).get(j - 1);
                int b = result.get(i - 1).get(j);

                meep.add(a+b);
            }
            result.add(meep);
            System.out.println("result = " + result);
        }
//        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]


//        String st = "RLRLLLLRRR";
//        int r=0,l=0;
//        int count=0;
//        char[] stInChar = st.toCharArray();
//        for (char a : stInChar) {
//            if (a == 'R') {
//                r++;
//            }if (a == 'L') {
//                l++;
//            }
//            if (r == l) {
//                count++;
//                r=0;
//                l=0;
//            }
//
//        }
//        System.out.println("count = " + count);

//
//        int n = 5;
//        Output: [0,1,1,2,1,2]
//        Explanation:
//        0 --> 0
//        1 --> 1
//        2 --> 10
//        3 --> 11
//        4 --> 100
//        5 --> 101
//        int[] result= new int[n+1];
//        for (int i = 1; i < result.length; i++) {
//            result[i]=countBits(i);
//        }
//        System.out.println("result = " + Arrays.toString(result));
//


    }

//    private static int countBits(int i) {
//        int count=0;
//        while (i >0) {
//            count += i & 1; //홀수 일떄 카운트에 1추가
////            System.out.println("count =" + count);
//            i>>=1; // 오른쪽으로 1비트 이동하면 i=2일때 1이되고 두번째에는 1에서 0이 된다.
////            System.out.println(i);
//}return count;
//
//    }
}
