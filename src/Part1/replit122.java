package Part1;

import java.util.Scanner;

public class replit122 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        //int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        int[] nums = {1, 1, 2, 2, 3,};
        //TODO: write your code below

        for (int j =0; j<=nums.length-1; j++) {
            int arr = nums[j];
            int count = 0;
            for (int each : nums) {

                if (each == arr) {
                    count++;
                }

            }
            if (count == 1)
                System.out.println(arr);
        }
    }
        }












