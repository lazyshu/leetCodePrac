package UglyAugust;

import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fifteenth {
    public static void main(String[] args) {
//        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
//        int count=0;
//        for (int i = 0; i < grid.length; i++) {
//            for (int j = 0; j < grid[i].length; j++) {
//                if (grid[i][j] < 0) {
//                    count++;
//                }
//            }
//        }
//        System.out.println("count = " + count);
        int seats[] = {4,1,5,9};
        int students[] = {1,3,2,6};
        Arrays.sort(seats);
        Arrays.sort(students);
        List<Integer> seats1 = new ArrayList<>();
        List<Integer> students1 = new ArrayList<>();
        for (int i=0; i<seats.length;i++) {
            seats1.add(seats[i]);
            students1.add(students[i]);
        }
        //same positioned seats are removed in both lists.
        for (int i=0;i<seats1.size();i++) {
            int seat = seats1.get(i);
            if (students1.contains(seat)) {
                students1.remove(Integer.valueOf(seat));
                seats1.remove(Integer.valueOf(seat));
            }
        }
        int count=0;
        System.out.println("students1 = " + students1);
        System.out.println("seats = " + seats1);
        for (int i = 0; i < seats1.size(); i++) {
                // 4, 5, 9
                count += Math.abs(seats1.get(i) - students1.get(i));
               
            }
        System.out.println("count = " + count);
        }



}

