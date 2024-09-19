package UglyAugust;

import java.util.*;

public class Eleventh {
    public static void main(String[] args) {
        int n=5;
        int[] lost={1,2,4};
        int[] reserve={1,3};
        List<Integer> spare = new ArrayList<>();
        spare.sort(Comparator.naturalOrder());
        for (Integer a : reserve) {
            spare.add(a);
        }
        System.out.println("spare = " + spare);
        int answer = n - lost.length; //5-3= 2
        int k=0;
        //lost 돌자 2,4
        for (int i = 0; i < lost.length; i++) {

            if(spare.isEmpty()){
                break;
            }
            if (spare.contains(lost[i])) {
                spare.remove(Integer.valueOf(lost[i]));
                answer++;
            } else if (spare.contains(lost[i]-1)) { // lost-2, reserve에서 1이 있는지 먼저 확인.
                spare.remove(Integer.valueOf(lost[i]-1)); //remove 1 from spare
                answer++;
            }else if (spare.contains(lost[i] + 1)) { //if lost was 3, find 4 from spare
                spare.remove(Integer.valueOf(lost[i] + 1)); // remove 4
                answer++;
            }
            System.out.println("you dont have " + lost[i]+ "from Lost");
            }
        System.out.println(answer);


    }
}
