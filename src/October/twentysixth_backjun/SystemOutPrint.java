package October.twentysixth_backjun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

public class SystemOutPrint {
    public static void main(String[] args) {
        int num=4;
        int spaces=1;

        for(int i=0;i<num-1;i++){
            for(int j=num-1;j>i;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i==0){
                System.out.println();
            }
            if(i!=0){
                for(int k=1; k>=spaces;k--){
                    System.out.print(" ");
                }spaces+=2;
                System.out.print("*");
            }

        }
        System.out.println();
        for(int i=0;i<(num*2)-1;i++){
            System.out.print("*");
        }
    }
}
