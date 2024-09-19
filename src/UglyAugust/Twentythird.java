package UglyAugust;


import java.util.*;

public class Twentythird {
    public static void main(String[] args) {
        int[][] grid = {{1,2,4},{3,3,1}};
        // Java Streams를 사용하여 2차원 배열을 정렬
        grid = Arrays.stream(grid)
                .sorted(Comparator.comparingInt(a -> a[0])) // 첫 번째 요소로 비교
                .toArray(int[][]::new);

        // 결과 출력
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println(Integer.MIN_VALUE);

//        Output: 8

//        List<int[][]> g = new ArrayList<>();
//        g.add(grid);

        for (int[] a : grid) {

                System.out.println("b = " + Arrays.toString(a));

        }
//        g.sort(Comparator.comparingInt(a-> to));
    }
}
