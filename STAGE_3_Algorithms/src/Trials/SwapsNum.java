package Trials;

import java.util.Scanner;

public class SwapsNum {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter Number Of Element!");
        int n = input.nextInt();
        int[] a = new int [n];
        System.out.println("Enter Elements");

        for (int i=0; i<= a.length-1; i++){
            a[i] = input.nextInt();
        }
        int temp;
        for(int j=0; j<=(a.length-1)/2; j++){
            temp = a[j];
            a[j] =a[n-j-1];
            a[n-j-1] = temp;
        }
        for (int i=0; i<= a.length-1; i++){
            System.out.println(a[1]);
        }
    }
}
