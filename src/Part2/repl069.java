package Part2;

import java.util.Scanner;

public class repl069 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
int halfindex = word.length()/2;
        System.out.println(""+word.substring(0 ,halfindex)+word.substring(0 ,halfindex));
    }
}
