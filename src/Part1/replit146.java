package Part1;

import java.util.Scanner;

public class replit146 {
    public static void main(String[] args) {
        plus();
    }

    public static void plus(){
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result =num1+num2;
        System.out.println("result: "+result);
    }

}
