package Part3;

import java.util.Scanner;

public class overdose {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizen = scan.nextInt();
        int nonSeniorCitizen = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int Age = scan.nextInt();

        if (Age >=65) {
            System.out.println("seniorCitizens");
            seniorCitizen = ++seniorCitizen;

        }else if (Age<65){
                System.out.println("nonSeniorCitizens");
            nonSeniorCitizen = ++nonSeniorCitizen;
        }
        System.out.println("New seniorCitizen count "+seniorCitizen);
        System.out.println("New nonSenior count "+nonSeniorCitizen);
    }
}