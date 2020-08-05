package Part1;

public class repkit153 {
    public static void main(String[] args) {
        String s = "jon,doe,30";
        person(s);
    }
    public  static void person(String info){


        String[] arr = info.split(",");
        System.out.println("person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);
    }
}
