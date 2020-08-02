package Part1;

public class replit123 {
    public static void main(String[] args) {

        int k =0;

        for(int i = 1; i<=10; i++){
          if( i<=3){
              System.out.println("year "+i+" - growth is 1 cm");

              k =k+1;
          }else {
              System.out.println("year "+i+" - growth is 2 cm");
              k+=2;
          }
            System.out.println("tree size: "+k);
        }


    }
}
