package Part2;

import java.util.Scanner;

public class replit056 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char  command = scan.next().charAt(0);
        String response ="";

        switch (command){

            case 'y':

                response = "Your request is being processed is printed";
                break;
            case 'n':
                response = "Thank you anyway for your consideration is printed";
            break;
            case 'h':
                response = "Sorry, no help is currently available is printed";
                break;

            default:
                response = "Invalid entry,please try again!";


        }
        System.out.println(response);




    }
}
