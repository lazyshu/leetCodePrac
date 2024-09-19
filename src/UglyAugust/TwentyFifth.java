package UglyAugust;

import java.util.ArrayList;
import java.util.List;

public class TwentyFifth {
    public static void main(String[] args) {
//        progresses	speeds	return
//[93, 30, 55]	[1, 30, 5]	[2, 1]
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        int[] t = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            t[i] = (100 - progresses[i]) /speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                t[i]++;
            }
            System.out.println("t = " + t[i]);
        }
        int result=1;
        int max=t[0];
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < t.length; i++) {
            if (max >= t[i]) {
                result++;
                System.out.println("result = " + result);
            } else {
                list.add(result);
                max = 1;
                result=1;
            }
        }list.add(result);
        System.out.println(list);
    }
}
