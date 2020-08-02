package Part1;

public class replit097 {
    public static void main(String[] args) {
        String word ="javajavaxjava";

        int count =0;

        while(word.contains("java")){
            count++;
           word= word.replaceFirst("java","");
        }
        System.out.println(count);

    }
}
