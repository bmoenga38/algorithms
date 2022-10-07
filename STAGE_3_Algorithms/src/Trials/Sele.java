package Trials;

public class Sele {
    public static void SortNums(Integer [] list){
        //go thru the arr
        for (int i = 0; i < list.length; i++) {
            //define min
            int min = i;
            //go through the remaining list and see if there is smaller number
            for (int j = i + i; j < list.length; j++) {
                //if there is a smaller number
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            if (i != min) {
                //do 0the swapping
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Integer [] list = new Integer[8];
        list[0] = 1;
        list[1] = 2;
        list[2] = 3;
        list[3] = 4;
        list[4] = 5;
        list[5] = 6;
        list[6] = 7;
        list[7] = 8;
        SortNums(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
