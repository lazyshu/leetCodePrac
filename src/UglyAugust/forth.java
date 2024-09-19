package UglyAugust;

import java.util.Arrays;

public class forth {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] result = new int[commands.length];
        for (int i = 0; i < commands.length; i++) { //3 times
            int first = commands[i][0]-1;
            int second = commands[i][1];
            int[] arr = new int[second - first];
            int ij=0;
            for (int j = first; j < second; j++) {
                arr[ij]=array[j];
                ij++;
            }
            Arrays.sort(arr);
            result[i]=arr[commands[i][2]-1];
            ij=0;
        }
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
}
