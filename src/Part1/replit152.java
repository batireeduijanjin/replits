package Part1;

public class replit152 {
    public static void main(String[] args) {

        int[] arr ={1,2,55,-9,-2,0,0};
        plus(arr);
    }
    public static void plus(int []b ){


        int positive =0;
        int negative =0;
        int zero =0;


        for(int each:b){
            if(each==0){
                zero++;
            }else if(each>0){
                positive++;
            }else{
                negative++;
            }
        }
        System.out.println("positive: "+positive+", negative: "+negative+", zero: "+zero);



    }
}
