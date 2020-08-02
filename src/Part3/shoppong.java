package Part3;

import java.util.Scanner;

public class shoppong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter item1, count and its price:");
        String item1 = scan.next();

        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter item2, count and its price:");
        scan.nextLine();
        String item2 = scan.next();

        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter item3, count and its price:");
        scan.nextLine();
        String item3 = scan.next();

        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        String report="";
        double totalPrices1 = price1*count1;
        double totalPrices2 = price2*count2;
        double totalPrices3 = price3*count3;
        double totprice = totalPrices1+totalPrices2+totalPrices3;
        if(count2 == 0){
            report = "Item1: "+item1 + " Price: "+totalPrices1+"Item3: "+item3 + " Price: "+totalPrices3;


        }else if( count3 == 0){
            report = "Item1: "+item1 + " Price: "+totalPrices1+"Item2: "+item2 + " Price: "+totalPrices2;

        }else{
            report= "Item1: "+item1 + " Price: "+totalPrices1+"Item2: "+item2 + " Price: "+totalPrices2+"Item3: "+item3 + " Price: "+totalPrices3;

        }
        System.out.println(report);

        System.out.println("Total price: " +totprice);

    }
}
