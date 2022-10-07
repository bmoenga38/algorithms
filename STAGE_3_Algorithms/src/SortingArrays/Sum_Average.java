package SortingArrays;

public class Sum_Average {
    public static void main(String[] args) {
        /*Write a java program that computes average score
            for each student tested on 7 subjects/ units for
             a class of 10 students*/

        int[] marks = {20, 40, 50, 90, 70, 05, 58};
        int sum = 0;
        Double average;

        //for eachloop to execute;
        for (int number: marks) {
            sum += number;
        }

        int arrayLength = marks.length;

        average = ((double)sum / (double) arrayLength);
            System.out.println("sum  =" + sum);
        System.out.println("Average = " + average);
    }
}
