package Part2;

import java.util.Scanner;

public class replit059 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter full name");
        String name = scan.nextLine();
        if(name.equalsIgnoreCase("Max Payne")|| name.equalsIgnoreCase("Alan Wake")){
            System.out.println("User found");
        }else{
            System.out.println("User not found");
        }
    }
}
