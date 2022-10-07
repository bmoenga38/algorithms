package SortingArrays;

import java.util.Scanner;

public class SelectionTwo {
    Scanner s;
    int [] data;

    public SelectionTwo(){
        s = new Scanner(System.in);
        System.out.println("How many Element Do you Want...");

        int size = s.nextInt();
        data = new int[size];

        System.out.println("Enter  "+ size + " Elements");

        for(int i =0; i< size; i++){
            data [i] = s.nextInt();
        }
        sortArray(data);
        printArray(data);
    }
    public void sortArray (int [] nums){
        int temp;

        for (int i= 0; i<nums.length;  i++){
            int minIndex = i;

            for (int j = i +1; j < nums.length; j++) {
                if (nums[j] <nums [minIndex]){
                    minIndex = j;
                }//for
            }//for

            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }

    }
    public void printArray (int [] arr){
        for (int n : arr) {
            System.out.print( n + "  ");

        }
    }
    public static void main(String[] args) {
        new SelectionTwo();
    }
}
