package September.twentyfourth;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision_stack {
    public static void main(String[] args) {
        int[] asteroids = {-2,-2,1,-1};
//        int[] asteroids = {5,10,-5};
//        int[] asteroids = {-2,-1,1,2};
//        Output: [10]
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            st.add(asteroids[i]);
        }
        System.out.println("st = " + st);
        Stack<Integer> arrange = new Stack<>();
        int pop = st.pop();
        int secondPop=0;
        while (!st.empty()) {
            secondPop = st.pop();
            System.out.println(pop);
            System.out.println("secondPop = " + secondPop);

            if ((pop<0&&secondPop<0)||pop > 0) {
                arrange.add(pop);
                pop = secondPop;
                //secondPop이 더 작으면 세컨드팝이 사라져야함.. pop=-5은 남아있는다
                //pop==-5 && -5가 secondpop보다 작을 경우 -5<6 그럼 -5가 사라지고 6만 남는다.
            } else if (pop < 0 && secondPop > 0 && Math.abs(pop) < secondPop) {
                pop = secondPop;

            } else if (pop < 0 && secondPop > 0 && Math.abs(pop) == secondPop) {
                pop = arrange.pop();
            }
        }
        arrange.add(secondPop);
        System.out.println("arrange = " + arrange);
        int[] result = new int[arrange.size()];
        int i=0;
        while(!arrange.empty()) {
            result[i] = arrange.pop();
            i++;
            System.out.println("result = " +arrange.size());
        }
        System.out.println("Arrays.toString(re) = " + Arrays.toString(result));
    }
}
