package Part2;

import java.util.Scanner;

public class repl035 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.next();

        int balance = 100;
        int Smartphone = 300;
        int Laptop = 400;
        int Charger = 15;
        int USB = 10;
        int Headphones = 30;
        int Pants = 50;
        int Hat = 25;
        int Socks = 5;
        int Blanket = 60;
        int Pillow = 40;

        if (item.equals("Smartphone") || item.equals("Laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equals("Charger")) {
            System.out.println("Thank you for your purchase!");
            balance -= Charger;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("USB")) {
            System.out.println("Thank you for your purchase!");
            balance -= USB;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Headphones")) {
            System.out.println("Thank you for your purchase!");
            balance -= Headphones;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Pants")) {
            System.out.println("Thank you for your purchase!");
            balance -= Pants;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Hat")) {
            System.out.println("Thank you for your purchase!");
            balance -= Hat;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Socks")) {
            System.out.println("Thank you for your purchase!");
            balance -= Socks;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Blanket")) {
            System.out.println("Thank you for your purchase!");
            balance -= Blanket;
            System.out.println("Your current balance is: " + balance + "$");
        } else if (item.equals("Pillow")) {
            System.out.println("Thank you for your purchase!");
            balance -= Pillow;
            System.out.println("Your current balance is: " + balance + "$");
        }

            else {
            System.out.println("Invalid item!");
        }
}
}






