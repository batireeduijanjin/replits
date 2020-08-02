package Part1;

import java.util.Scanner;

public class replit128 {
    public static void main(String[] args) {
        //Scanner scan= new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        //double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
        //        scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };



        double[] temps ={80, 88, 88 ,84 ,82, 78, 60, 68};
        for(int i =0; i <=temps.length-1; i++){
           total += temps[i];
        }
        System.out.println(total);
        k=temps.length;
        avgTemp = total/k;
        System.out.println(avgTemp);
    }
}
