package Part1;

public class replit125 {
    public static void main(String[] args) {
        String[] str = {"hand", "batireedui", "Maral", "Neguun","hi"};
        String shortest = str[0];
        for (String each : str) {

            if (each.length() < shortest.length())
                shortest = each;



        }
        System.out.println(shortest);
    }
}
