package Part1;

import java.util.Arrays;

public class replit098 {
    public static void main(String[] args) {


        String str = "hi how hi hello hi hitman";

        int count =0;
        for(int i =0; i <=str.length()-1; i++){
            if(str.contains("hi")){

                str=str.replaceFirst("hi","");
                count++;
            }
        }

        System.out.println(count);


    }
}
