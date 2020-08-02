package Part1;

public class replit099 {
    public static void main(String[] args) {
        String str ="hihihihellohehe";
        System.out.println(str.substring(0,2));
        int n =0;
        if(n>0&&n<str.length()) {
            int count = 0;
            for(int i= 0; i <= str.length()-n; i++){
                if( str.substring(i,i+n).equals(str.substring(0,n))  ){
                    count++;
                }
            }
            boolean result = n<=count;
            System.out.println(result);
        }else{
            System.out.println("false");
        }
    }


}


