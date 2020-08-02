package Part1;

import java.util.Arrays;

public class relit126 {
    public static void main(String[] args) {
        String str ="olive, fish, pursuit, old, warning, python, java, coffee, cat, ray";
        String [] arr = str.split(", ");
        String result= "";

        String shortest =arr[0];

        for(String each :arr){
            if(each.length()<shortest.length()) {
                shortest =each;
            }
            }

      for(String each:arr){
          if(each.length()==shortest.length()){
            result+=each+",";
          }
      }

       String[] shortestWords =result.substring(0,result.length()-1).split(",");
        System.out.println(Arrays.toString(shortestWords));
       Arrays.sort(shortestWords);
        System.out.println(Arrays.toString(shortestWords));

       }

    }

