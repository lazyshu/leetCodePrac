package September.twentyFifth;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class AsteroidCollision_stack {
    public static void main(String[] args) {
//        int[] asteroids = {-2,-2,1,-1};
//        int[] asteroids = {-2,1,-2,-2}; //-2,-2,-2
//        int[] asteroids = {5,10,-5}; //5,10
//        int[] asteroids = {-2,2,-1,-2}; //-2
        int[] asteroids = {-2,-1,1,2};
//        int[] asteroids = {8, -8};
//        int[] asteroids = {-2,-2,1,-2};
//        Output: [10]
        Stack<Integer> st = new Stack<>();
        st.add(asteroids[asteroids.length - 1]);
//        System.out.println("st = " + st);
        for (int i = asteroids.length-2; i >=0; i--) {
            // when right is minus.

            int right = asteroids[i];

            if (!st.empty()&&st.peek() < 0) {
                if (right < 0) {
                    st.add(right);
                } else {
                    while (!st.empty()&&st.peek()<0&&right>0) {
                        int stpop = st.pop();
                        if (Math.abs(stpop) == right) {
                            break;
                        } else if (Math.abs(stpop)<right&&st.empty()){
                            st.add(right);
                        } else if (Math.abs(stpop) < right && !st.empty() && st.peek() > 0 && Math.abs(stpop) < right) {
                            st.add(right);
                        } else if (Math.abs(stpop)>right) {
                            st.add(stpop);
                            break;
                        }


                    }

                }
            } else {
                st.add(right);
            }
        }
        int[] result = new int[st.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = st.pop();
        }
        System.out.println(Arrays.toString(result));
    }
}
