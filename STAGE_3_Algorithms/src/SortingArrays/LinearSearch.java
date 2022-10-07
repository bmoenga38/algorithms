package SortingArrays;

import java.util.Scanner;

public class LinearSearch {
    int [] nums = {200, 80, 27, 10, 35, 5, 42, 44 , 3, 2, 49};
    Scanner s;

    public  LinearSearch(){
        s = new Scanner(System.in);
        System.out.println("Enter Element to search:");
        int num = s.nextInt();


        for (int i= 0; i < nums.length; i++) {

            if (num == nums[i]) {
                System.out.println("Found here " + i);
            }
         /*   else {
                System.out.println("Not Found");
            }*/
        }
        for (int n:  nums ) {
            System.out.println(n  +" " + " Not Found");
        }
    }

    public static void main(String[] args) {
        new LinearSearch();
    }
}
