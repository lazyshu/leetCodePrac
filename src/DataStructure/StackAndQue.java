package DataStructure;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Stack;

//백준문제 1874번
public class StackAndQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int[] inputArray = new int[input];
        for (int i = 0; i < input; i++) {
            inputArray[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        boolean result = true;
        int num=1;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < inputArray.length; i++) { //8번
            int su = inputArray[i];
            if (num <= su) {
//                1이 4가 될떄까지 스택에 넣어준다
                while (num <= su) {
                    stack.push(num++);
                    stringBuffer.append("+ \n"); //끝에 n=5당 스택 1,2,3,4
                }
                stack.pop();
                stringBuffer.append("- \n");

            } else {
                if (stack.peek() == su) { //num=5, su=3 stack=3 or what if
                    stack.pop();
                    stringBuffer.append("- \n");
                } else {
                    System.out.println("NO");
                    result = false;
                    break;
                }
            }

        }
        if (result) {

            System.out.println(stringBuffer);
        }




    }
}






















//for (int i = 0; i < inputArray.length; i++) { //8번
//int su = inputArray[i];
//            if (su>=num) {
//        while (num <= su) {
//        stack.push(num++);
//                    stringBuffer.append("+\n");
//                }
//                        stack.pop();
//                stringBuffer.append("-\n");
//            } else {
//int n = stack.pop();
//                if (n > inputArray[i]) {
//        System.out.println("NO");
//                    break;
//                            } else {
//                            stringBuffer.append("-\n");
//                }
//                        }
//
//                        }