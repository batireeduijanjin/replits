package Part1;

public class replit101 {
    public static void main(String[] args) {
        String sentence = "We study java not pythonhaha python javahaha";
        int java = 0;
        int python = 0;

        for (int i = 0; i <= sentence.length() - 4; i++) {
           if(sentence.substring(i,i+4).equals("java")) {
               java++;
           }
        }
        for(int i =0; i<=sentence.length()-6; i++){
            if(sentence.substring(i,i+6).equals("python")){
                python++;
            }
        }
        System.out.println(java==python);


        }
    }