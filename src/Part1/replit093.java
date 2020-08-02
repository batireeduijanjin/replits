package Part1;

import java.util.Scanner;

public class replit093 {
    public static void main(String[] args) {

        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

            //         0123456
        String index0= word.substring(0,4);
        String index1 = word.substring(1,5);

        if(index0.equalsIgnoreCase("java")||index1.equalsIgnoreCase("java")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        System.out.println(word.startsWith("java")||word.substring(1).startsWith("java"));
    }
}
