package codetest.June;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int result[][] = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] answer = {1, 2, 3, 4, 5};
        int[] correctAnswer = new int[3];
        int[] newResult = new int[answer.length];
        for (int i = 0; i < result.length; i++) {
            if (answer.length > result[i].length) {

                for (int s = 0; s < answer.length; s++) {
                    newResult[s] = result[i][s / result[i].length];
                    if (answer[s] == newResult[s]) {
                        correctAnswer[i]++;
                    }
                }
            } else {
                for (int ss = 0; ss < answer.length; ss++) {
                    newResult[ss] = result[i][ss];
                    if (answer[ss] == newResult[ss]) {
                        correctAnswer[i]++;
                    }
                }
            }
        }for (int i = 0; i < correctAnswer.length; i++) {
            System.out.println("Correct answers for row " + (i + 1) + ": " + correctAnswer[i]);
        }
    }
}
