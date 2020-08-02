package Part1;

public class replit100 {
    public static void main(String[] args) {

        String str = "breadbread";
        if (str.contains("bread")) {
            int first = str.indexOf("bread");
            int last = str.lastIndexOf("bread");
            if (first == last) {
                System.out.println("nothing");


            } else {
                String result = str.substring(first + 5, last);
                System.out.println(result);
            }


        }else {
            System.out.println("nothing");
        }
    }
}
