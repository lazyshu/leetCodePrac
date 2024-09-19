package codetest.June;

import java.util.ArrayList;
import java.util.Arrays;

public class June13th {
    public static void main(String[] args) {
       int[] seats = {3,1,5};
       int[] students = {2, 7, 4};
        Arrays.sort(seats);
        Arrays.sort(students);
int count=0;
        System.out.println("students = " + Arrays.toString(students));
        System.out.println("seats = " + Arrays.toString(seats));
        for (int i = 0; i < students.length; i++) {
            if (seats[i] == students[i]) {
                continue;
            }
           count +=Math.abs(students[i] - seats[i]);
        }
        System.out.println("count = " + count);
    }
}
