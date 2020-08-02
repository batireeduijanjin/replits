public class warmup {
    public static void main(String[] args) {
        /*
        1. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
        ex:
            month = 3
        output:
            31 days
            month = 4
        output:
            30 days
            month = 13
        output:
            Invalid month

        HINT:
            28 days: 2
            30 days: 4,6,9,11
            31 days: 1,3,5,7,8,10,12

         */
        int feb = 22;
        String month = "";
        if(feb == 2){
            month = feb+"=month 28 days";
            //System.out.println("month= "+feb + " 28 days");
        }else if( feb == 1 || feb == 3 || feb == 5 || feb == 7 || feb ==8 || feb == 10 || feb == 12){
            month = feb+"=month 31 days";
            //System.out.println("month="+feb + " 31 days");
        }else if(feb == 4 || feb == 6 || feb==9 || feb== 11){
            month = feb+"=month 30 days";
            //System.out.println("month= "+feb + " 30 days");
        }else if(feb>12 || feb<0){
            month = feb+" Invalid month ";
            //System.out.println("Invalid Month");
        }
        System.out.println(month);





    }
}
