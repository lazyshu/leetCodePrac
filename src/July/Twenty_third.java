package July;

import java.util.*;
import java.util.stream.Stream;

public class Twenty_third {
    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "sam"};
        String[] completion = {"leo", "kiki"};
        HashMap<String,Integer> hm = new HashMap<>();

        for (String a : participant) {
            hm.put(a, hm.getOrDefault(a,0)+1);
        }

        for (String a : completion) {
            hm.put(a, hm.get(a)-1);
        }
        for (String a : hm.keySet()) {
            if (hm.get(a) != 0) {
                System.out.println("a = " + a);
            }
        }

//        효율성 면에서 좋은 답안이 아닙니다.
//        keySet하고 또 get하는 건 매우 비효율적인 코드입니다.
//        get할 때마다 계속 HashMap을 search하니까요. key, value를 같이 가져올 때는 항상 entrySet을 사용해야 해요.
//                Eugene Chung―2019.08.31 23:01
//       getKey() / getValue()와 HashMap의 get()은 이름이 비슷할 뿐 내부 과정은 다릅니다.
//       전자는 현재 차례의 entry의 속성 값을 바로 가져오는 반면, 후자는 (hashmap에서 찾아야 해서)
//       hashcode(), equals() 등의 함수를 내부에서 실행하며 시간을 더 사용합니다.
//       그런 점에서 entrySet 사용을 권장하는 것 같습니다.
//       대부분 get()은 O(1)에 수렴하며 getValue()도 자명한 O(1)이지만 같은 1이 아닌 것이지요.
//                탈퇴한 사용자―2020.04.08 13:59
    }
}
