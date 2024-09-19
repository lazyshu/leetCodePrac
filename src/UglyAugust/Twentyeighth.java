package UglyAugust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Twentyeighth {
    public static void main(String[] args) {
        int[] citations={3, 0, 6, 1, 5};
        Arrays.sort(citations);
        int n = citations.length;
        int answer=0;
        for (int i = 0; i < n; i++) {
            System.out.println("citations = " + citations[i]);
            System.out.println("i = " + i);
            System.out.println("n = " + n);
            if (citations[i] >= n - i) {
                answer++;
                System.out.println("answer++");
            }
        }
        System.out.println("answer = " + answer);





//        int[] numbers = {10, 6, 7, 2, 12,102};
//        List<String> list= new ArrayList<>();
//        for(int i=0;i<numbers.length;i++){
//            list.add(numbers[i]+"");
//        }
//        String answer="";
//        System.out.println(list);
//        while(!list.isEmpty()){
//            String max="0";
//            int cIndex=0;
//            for(int i=0; i<list.size();i++){
//                if (max.charAt(0) < list.get(i).charAt(0)) {
//                    max = list.get(i);
//                } else if (max.charAt(0) == list.get(i).charAt(0)) {
//                    int minIndex = Math.min(max.length(), list.get(i).length());
//                    for (int j = 1; j < minIndex; j++) {
//                        if (max.charAt(j) < list.get(i).charAt(j)) {
//                            max= list.get(i);
//                        }
//                    }
//                    if (max.length()>list.get(i).length()) {
//                        if (max.charAt(list.size() + 1)<max.charAt(0)) {
//                            max= list.get(i);
//                        }
//                    }
//                    if (max.length()<list.get(i).length()) {
//                        if (list.get(i).charAt(max.length()+1)>list.get(i).charAt(0)) {
//                            max= list.get(i);
//                        }
//                    }
//
//                }
//
//            }
//            list.remove(max);
//            answer+=max;
//        }
//        System.out.println("answer = " + answer);
    }
}
