package Part2;

import java.util.Scanner;

public class replitFOrLoop1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("In:");
        String word = inp.nextLine();
        for( int i =0; i <=word.length()-1;i++){


            char ch = word.charAt(i);
            System.out.println(ch);

        }

    }
}
