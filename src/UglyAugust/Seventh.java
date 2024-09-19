package UglyAugust;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seventh {
    public static void main(String[] args) {
        int[] answers = {1,3,2,4,2};
        int arrays[][]={{1,2,3,4,5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] count= new int[3];
      
        int[][] one=new int[arrays.length][answers.length];
        for(int j=0; j<one.length;j++){
            for(int i=0; i<answers.length; i++){
                one[j][i]=arrays[j][i%arrays[j].length];
            }
            System.out.println("Arrays.toString(one[j]) = " + Arrays.toString(one[j]));
        }
        for(int i=0; i<one.length;i++){
            for(int j=0; j<answers.length; j++){
                if(one[i][j]==answers[j]){
                    count[i]++;
                }
            }
        }
        int max = Arrays.stream(count).max().getAsInt();
        List<Integer> listResult = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {

            if (count[i] == max) {
                listResult.add(i);
            }
        }
        int[] result = new int[listResult.size()];
        for (int i = 0; i < listResult.size(); i++) {
            result[i]= listResult.get(i)+1;
        }
        System.out.println(Arrays.toString(result));
        
    }
}
