package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Stack;

public class Que {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        Stack<Integer> stack = new Stack<>();
        PriorityQueue<Integer> que = new PriorityQueue<>(((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs) {
                return o1 > o2 ? 1 : -1; //절대값 같은 경우 음수 우선
            }
            return first_abs - second_abs;//절대값 작은 데이터 우선 (second_abs - first_abs 절대값 큰 데이터 우선일 경우)
        }));
        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(bf.readLine());
            if (number == 0) { //0이 들어오면 큐에서 숫자 뺴기
                if (que.isEmpty()) { //큐에 아무것도 없으면 0
                    stack.push(0);
                } else {
                    int minNumber = que.poll();
                    stack.push(minNumber); //return min number.
                }
            } else {
                que.add(number); // just put number into the que (not in stack)
            }
        }
        System.out.println("stack = " + stack);
    }
}
