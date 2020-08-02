package Part1;

import java.util.Scanner;

public class replit141 {
    public static void main(String[] args) {


        int[] num ={3,5,6};

        int[] num1 = new int[num.length*2];
               num=num1;

               num[num.length-1]=num1[num.length-1];

        System.out.println(num1[num1.length-1]);


    }
}
