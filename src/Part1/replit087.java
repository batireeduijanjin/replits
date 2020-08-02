package Part1;

import java.util.Arrays;
import java.util.Scanner;

public class replit087 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int day =0;
       for(int i= inhabitants; inhabitants>0; inhabitants/=2 ){

           System.out.println("Day "+ day+" ["+inhabitants+"]");
           day++;

       }

        System.out.println("EXTINCT");

    }
}
