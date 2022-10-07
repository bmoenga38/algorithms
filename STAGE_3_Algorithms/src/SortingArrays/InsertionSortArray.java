package SortingArrays;

import java.util.Scanner;

public class InsertionSortArray {
    Scanner s;
    int [] data = {14,33,27,10,35,19,42,44,1};
    int temp;

    public InsertionSortArray(){
        for (int i = 0; i < data.length ; i++) {
            int key = data[i];
            int prev = i - 1;

            while (prev >=0 && key < data[prev]){
                data[prev + 1] = data[prev];
                -- prev;
                data[prev + 1] = key;
            }
        }//for loop;
        for (int n : data) {
            System.out.print( n + "  ");
        }
    }
    public static void main(String[] args) {
        new InsertionSortArray ();
    }
}
