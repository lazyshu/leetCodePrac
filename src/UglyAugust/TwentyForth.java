package UglyAugust;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwentyForth {
    public static void main(String[] args) {
      String[][] st={{"yellow_hat", "headgear"},{"blue_sunglasses","bracelet"}, {"green_turban", "headgear"}};
//              , {"d", "bracelet"}, {"m", "bracelet"}, {"meep", "ring"}};
        Map<String, Integer> hm = new HashMap<>();

        int answer = 1;
        for (int i = 0; i < st.length; i++) {
            Integer value = hm.get(st[i][1]);
            if (!hm.containsKey(st[i][1])) {
                hm.put(st[i][1], 1);
            } else {
                hm.put(st[i][1], value + 1);
            }

        }

        for(String key : hm.keySet()){
            answer *= (hm.get(key)+1); //3*1, 3*2=6
            System.out.println("key = " + key);
            System.out.println("answer = " + answer);
        }
        System.out.println("answer = " + --answer);


//        for (String key:hm.keySet()) {//hashmap의 각 키에 대한 반복
//
//            for (String value:hm.get(key)) {
//                answer++;
//            }
//        }
    }
}
