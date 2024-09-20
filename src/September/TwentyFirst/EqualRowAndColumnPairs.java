package September.TwentyFirst;

import java.util.Arrays;
import java.util.HashMap;

public class EqualRowAndColumnPairs {
    public static void main(String[] args) {

//        https://www.youtube.com/watch?v=97TaGIED6kk
//        이거 보고 함- 해쉬맵의 getOrDefault 사용하기 1920ms 나와서 다음에 또 해보기 :(
//        int[][] grid = {{11,1},{1,11}};
//        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
        int[][] grid = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        int n = grid.length;
        HashMap<String, Integer> rows = new HashMap<>();
        for (int[] a : grid) {
            String row = Arrays.toString(a);
            rows.put(row, rows.getOrDefault(row, 0) + 1);
        }
        int count=0;
        for (int i = 0; i < n; i++) {
            int[] col = new int[n];
            for (int j = 0; j < n; j++) {
                col[j] = grid[j][i];
                count += rows.getOrDefault(Arrays.toString(col), 0);
                //0에서 같은게 들어올떄마다 value가 하나씩올라가나봉가..+ 1을 리턴한당...

            }
        }
        System.out.println("count = " + count);






        /**
         * 이렇게 하니 input-grid의 output이 2가 아니라 3이 나온다, input grid에 맞추면 input grid3이 3이 아니라 2가 나오구... 추악
         */
//        int[][] grid = {{11,1},{1,11}};
////        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};
////        int[][] grid3 = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
////        Output: 1
//        HashMap<Integer, Integer> rowhm = new HashMap<>();
//        HashMap<Integer, Integer> col = new HashMap<>();
//        int count=0;
//        for (int i = 0; i < grid.length; i++) {
//            String row = "";
//            String column = "";
//            for (int j = 0; j < grid.length; j++) {
//                row += grid[i][j];
//                column += grid[j][i];
//            }
//            System.out.println("column = " + column);
//            System.out.println("row = " + row);
//            if (col.containsKey(Integer.valueOf(row))) {
//                count++;
//            }
//                rowhm.put(Integer.valueOf(row), 1);
//
//            if (rowhm.containsKey(Integer.valueOf(column))) {
//                count++;
//            }
//                col.put(Integer.valueOf(column), 1);
//
//
//        }
//        System.out.println("count = " + count);

    }
}
