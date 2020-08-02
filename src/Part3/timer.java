package Part3;

import java.util.Scanner;

public class timer {
    public static void main(String[] args) {
        Scanner export = new Scanner (System.in);
        int inputSeconds = export.nextInt();
        System.out.println("Enter seconds:");

        int hours =inputSeconds  / 3600;
        int minutes =( inputSeconds  / 60) % 60 ;
        int seconds = inputSeconds % 60;

        System.out.println(hours + " hours, " + minutes + " minutes, and " + seconds + " seconds" );

    }
}
