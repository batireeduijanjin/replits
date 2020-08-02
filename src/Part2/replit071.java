package Part2;

import java.util.Scanner;

public class replit071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        boolean start = (txt.charAt(0)=='x'|| txt.charAt(0)=='X');
        boolean ends=(txt.charAt(txt.length()-1)=='x' || txt.charAt(txt.length()-1)=='X') ;
        boolean both = (txt.charAt(0)=='x'|| txt.charAt(0)=='X') && (txt.charAt(txt.length()-1)=='x' || txt.charAt(txt.length()-1)=='X') ;

        if(both) {
            System.out.println(txt.substring(1, txt.length() -1));
        }else if(start){
            System.out.println(txt.substring(1));
        }else if (ends){
            System.out.println(txt.substring(0,txt.length()-1));

        }else{
            System.out.println(txt);
        }
        }
       }




