package Part3;

public class replit076 {
    public static void main(String[] args) {
        String input = "mike_tyson@yahoo.com";

        if(!input.contains("_")){


        }else{
            String firstName = input.substring(0,input.indexOf("_"));
            String last = input.substring(input.indexOf("_")+1, input.indexOf("@"));
            String email = input.substring(input.indexOf("@"));
            System.out.println(last+"_"+firstName+email);
        }

    }
}
