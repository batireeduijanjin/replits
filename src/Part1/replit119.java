package Part1;

import java.util.Arrays;

public class replit119 {
    public static void main(String[] args) {

        String email = "batireedui@gmail.com";
        String[] arr = email.split("@");
        System.out.println(Arrays.toString(arr));
        if(arr.length==2){
        System.out.println("Email id: "+arr[0]);
        System.out.println("Email domain: "+arr[1]);
    }else{
            System.out.println("Invalid email");
        }
}}
