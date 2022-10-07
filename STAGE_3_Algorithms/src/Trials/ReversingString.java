package Trials;

import java.util.Scanner;

public class ReversingString {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.println(" Enter a String To Reverse...");
        String n = input.next();
        System.out.println("Your Reverse String is ");
        char[]a = n.toCharArray();

        for (int i= a.length-1; i>=0; i--){
            System.out.print(a[i]);
        }
    }
}
