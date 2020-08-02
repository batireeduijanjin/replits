package Part1;

import java.util.Arrays;
import java.util.Scanner;

public class replit110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};




      for(String each:words){

          char first=each.charAt(0);
          char last =each.charAt(each.length()-1);
          String result = ""+first+last;
          System.out.println(result);

      }




    }
}
