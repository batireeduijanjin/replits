package Part1;

import java.util.Arrays;
import java.util.Scanner;

public class replit115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int[] num = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};



        int sum= 0;
        for (int each:num){

            sum+=each;
        }
        System.out.println(sum);


    }
}
