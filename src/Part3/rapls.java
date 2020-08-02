package Part3;

import java.util.Scanner;

public class rapls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter area code:");
        int areaCode = scan.nextInt();
        System.out.println("Enter Local Number:");
        int LocalNumber = scan.nextInt();
        String phoneNumber = "("+areaCode+")-"+LocalNumber;
        System.out.println("Calling Number: "+phoneNumber);

    }

}
