package Part2;

import java.util.Scanner;
import java.util.stream.Stream;

public class repl077 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String firstName = email.substring(0,email.indexOf("_"));
        firstName =firstName.substring(0,1).toUpperCase()+firstName.substring(1);

        String lastName =email.substring((email.indexOf("_")+1),email.indexOf("@"));
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        String level = email.substring(email.indexOf(".")+1);
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Domain: "+domain);
        System.out.println("Top-Level Domain: "+level);






    }
}
