package TelAlgorithyms;

//find the repeated letter count in a given String:

import java.util.HashSet;
import java.util.Set;

public class RepeatedLetter {
    public static void main(String[] args) {
        String s ="aabbccde";
        Set<Integer> set = new HashSet<Integer>();

        long count = s.chars().filter(n->!set.add(n)).distinct().count();
        System.out.println(count);
    }
}


/*
*   1. i/o --> Spring
*       o/p --> 0
*
*   2. i/o --> banner
*      i/o --> 2
*
*   3. i/o --> aabbccde
*      i/o --> 3
 * */