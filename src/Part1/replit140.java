package Part1;

import java.util.Arrays;

public class replit140 {
    public static void main(String[] args) {
        String[] words = {"hello", "why", "by", "apple", "note"};
        String result = "";
        String [] arr = new String[words.length];
        for (String each : words) {
            result += "" + each.charAt(0) + each.charAt(each.length() - 1) + " ";

        }
        System.out.println(result);

        String[] kk=result.split(" ");
        System.out.println(Arrays.toString(kk));
    }


    }

