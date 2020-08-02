package Part2;

import java.util.Scanner;

public class repl064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        if (word.length() % 2 != 0) {
            if (word.length() >= 3) {
                System.out.println(word.charAt(word.length()/2));
            }

}
        if(word.length()==1){
            System.out.println(""+word.charAt(0)+word.charAt(0)+word.charAt(0));
        }
        if(word.length()%2==0 && word.length()>=4){
            System.out.println(""+word.charAt(word.length()/2-1)+word.charAt(word.length()/2));
        }
        if(word.length()==2){
            System.out.println(word.substring(0, 2)+word.substring(0, 2));
        }
    }
}