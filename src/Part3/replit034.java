package Part3;

import java.util.Scanner;

public class replit034 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your price in cents:");
        int itemPrice = scan.nextInt();

        int change = 100 - itemPrice;
        int quarters = change/25;  //40/25 1

        int dimes = change%25/10; // 15 10

        int nickels = change%25%10/5;
        if(itemPrice >=25 && itemPrice<=100 && itemPrice % 5 ==0){
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, and "+nickels+" nickels.");
        }else{
            System.out.println("Invalid price");

        }










    }
}
