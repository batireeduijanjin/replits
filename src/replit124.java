import java.util.Arrays;

public class replit124 {
    public static void main(String[] args) {

        int[] nums ={4,3,2,44,1,100,55};

        int index = 0;

        int[] arr = new int[nums.length];

        for(int i =nums.length-1; i>=0; i--){
            arr[index] = nums[i] ;
            index+=1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
