package Part2;

import java.util.Scanner;

public class repl043 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num = scan.nextInt();
        System.out.println("Enter second number:");
        int num1 = scan.nextInt();
        System.out.println("Enter third number:");
        int num2 = scan.nextInt();

        if((num> num1 && num<num2)||(num<num1 && num>num2)){
            System.out.println("Medium value is:"+num);
        }else if((num1> num && num1<num2)||(num1<num && num1>num2)){
            System.out.println("Medium value is:"+num1);
        }else{
            System.out.println("Medium value is:"+num2);
        }





    }
}
