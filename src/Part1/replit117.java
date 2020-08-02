package Part1;

public class replit117 {
    public static void main(String[] args) {
        String[]arr =  {"apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"};


        //arr[0]+arr[1];
        //arr[3]+arr[4];
        //arr[5]+arr[6];
        //arr[7]+arr[8];

        for (int i =0; i<arr.length-1; i+=2){
            String each =arr[i] +" , "+arr[i+1];
            System.out.println(each);

        }
    }
}
