package Part1;

public class jpo {
    public static void main(String[] args) {
        int[] scores = {85,  70,  95,  90,  100};   // 5
        //              0     1    2    3    4

        String [] names = {"Mike", "Adam", "Tonny", "John", "Amy"};  // size: 5
        //                  0        1       2        3        4

        /*
        System.out.println(  names[0]  + " : " + scores[0] );
        System.out.println(  names[1]  + " : " + scores[1] );
        System.out.println(  names[2]  + " : " + scores[2] );
        System.out.println(  names[3]  + " : " + scores[3] );
        System.out.println(  names[4]  + " : " + scores[4] );
    */

        for(int i=0; i <= 4; i++){ // i: 0,1,2,3,4
            System.out.println(  names[i]  + " : " + scores[i] );
        }

    }
}
