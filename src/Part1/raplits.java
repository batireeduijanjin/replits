package Part1;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Scanner;

public class raplits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();



        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        System.out.println("Enter your work phone number");
        int workPhoneNumber = scan.nextInt();

        System.out.println("Enter your personal phone number");
        int personalNumber = scan.nextInt();

        System.out.println("Enter your age");
        int age = scan.nextInt()    ;

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        System.out.println("Are you married");
        boolean married = scan.nextBoolean();


        System.out.println("Patient personal information"+"\n"+ "Full name: "+firstName+", "+lastName+"\n"+"Address: "+street+", "+city+", "+state+" "+zipcode+"\n"+"Contacts: work phone number - "+workPhoneNumber+", personal phone number - "+personalNumber+", email: "+email+"\n"+"Age: "+age+"\n"+"Height: "+height+"\n"+"Weight: "+weight+" pounds"+"\n"+"Married?: "+married);
    }
}
