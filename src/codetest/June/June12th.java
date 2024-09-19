package codetest.June;

import java.util.ArrayList;
//가중치없는 인접 리스트
public class June12th {
    public static void main(String[] args) {
        int n=6;
        ArrayList<Integer>[] array = new ArrayList[n];
        boolean[] exist = new boolean[n];
        int[][] vertex = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        for (int i = 0; i < vertex.length; i++) {
            array[vertex[i][0]].add(vertex[i][1]);
        }
        ArrayList<Integer>[] result;

        for (int i = 0; i < n; i++) {
            while (!array[i].isEmpty()) {
                int num=array[i].removeFirst();
                exist[num - 1] = false;


            }

        }

    }
}
