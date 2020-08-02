package Part1;

public class replit118 {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana","kiwi", "grape","milk","soda"};

        /*
        arr[0] arr[1] arr[2]
        arr[1] arr[2] arr{3]
        arr[2] arr[3] arr[4]
        arr[3] arr[4] arr[5]
         */


        for (int i =0; i<=arr.length-3; i++ ){
          String result1 = arr[i]+" , "+arr[i+1]+" , "+arr[i+2] ;
            System.out.println(result1);

        }




    }
}
