package Part1;

import java.util.Arrays;

public class replit137 {
    public static void main(String[] args) {
        String sentence ="Java is fun";
        String [] arr = sentence.split(" ");

        String[] n = new String[arr.length];
        int k=0;
        for(int i = arr.length-1; i>=0; i--){
            n[k]=arr[i];
            k++;
        }

        System.out.println(Arrays.toString(n));
        for(String each :n){
            System.out.println(each);
        }
    }
}
