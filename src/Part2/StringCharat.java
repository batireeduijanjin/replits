package Part2;

import java.util.Scanner;

public class StringCharat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        //batireedui
        //0123456789
       // String s = ""+txt.charAt(2)+ txt.charAt(4)+txt.charAt(5);

       // System.out.println(s);

        System.out.println(txt.length());
        System.out.println(txt.substring(0,2));
    }
}
