package Part1;

public class replit088 {
    public static void main(String[] args) {


        String str = "catdogdogcat";

        int countOfCats=0;
        int countOfDogs = 0;



       while(str.contains("dog")){
            countOfDogs++;
            str=str.replaceFirst("dog","");

        }
        while(str.contains("cat")){
            countOfCats++;
            str=str.replaceFirst("cat","");
        }
        System.out.println(countOfCats==countOfDogs);



    }
}
