package DataStructure;

import java.util.Collections;
import java.util.PriorityQueue;

public class PlayGround {
    public static void main(String[] args) {
        PriorityQueue<Integer> wt = new PriorityQueue<>((o1, o2) -> {
            return o2 - o1;
        });
        wt.add(4);
        wt.add(1);
        wt.add(1);
        wt.add(5);
        wt.add(2);
        wt.add(3);
        wt.add(5);
        wt.add(2);
        wt.add(3);
        int size = wt.size();
        for (int i = 0; i < size; i++) {
            System.out.print(wt.poll());
        }

    }
}
