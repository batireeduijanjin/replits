package Part1;

import java.util.Scanner;

public class replit163 {
    public static void main(String[] args) {

    Scanner scan =new Scanner(System.in);
        String[] arr = {};
        String str = scan.next();
    for(int i=0; i <=arr.length-1; i++){
        arr[i]= arr[i];
    }




        String[] some_array = {"a","foo","bar","foo","bla","foo"};
        String some_string = "foo";
        int count =0;

        for(String each:some_array) {
            if (each.equals(some_string)) {
                count++;
            }

        }

        System.out.println(count);

    }
}
