package Trials;

import java.util.Scanner;

public class ReverseUnseen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to Reverse");
        String n = input.next();
        System.out.println("Your Reversed String Is ....");

        char [] a = n.toCharArray();

        for (int i = a.length-1; i >=0 ; i--) {
            System.out.print(a[i]);
        }
    }
}
