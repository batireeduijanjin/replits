package Part1;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Arrays;
import java.util.Scanner;

public class replit132 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] score = new float[7];

        for (int j = 0; j <= score.length-1 ; j++) {
            System.out.println("Enter score for judge " + (j+1));
            float arr = scan.nextFloat();
            score[j]=arr;
        }
        System.out.println("Enter difficulty:");
       float difficult= scan.nextFloat();


            Arrays.sort(score);
            float total = 0;
            for (int i = 1; i <= score.length - 2; i++) {
                total += score[i];


            }
            System.out.println(total);
            total *= difficult*0.6;
            System.out.println(total);

        }
    }






