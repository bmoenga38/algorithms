package Trials;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        String S;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the string ");

        S = input.nextLine();
        int index = 0;

        index = S.lastIndexOf('l');
        System.out.println("last Index is :" + index);

    }
}
