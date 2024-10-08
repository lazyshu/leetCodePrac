package DataStructure;

import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        java.util.Queue<Integer> que = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            que.add(i);
        }
        System.out.println("que = " + que);
        while (que.size() > 1) {
            que.poll();
            que.add(que.poll());
        }
        System.out.println("que = " + que);
    }
}
