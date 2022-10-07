package Trials;

public class SelectionExample {

    public static void sortNumbers(Integer[] list) {
        //go through the list
        for (int i = 0; i < list.length; i++) {
            //define min
            int min = i;
            //go through the remaining list and see if there is smaller number
            for (int j = i + 1; j < list.length; j++) {
                //if there is a smaller number
                if (list[j] < list[min]) {
                    //remember its place
                    min = j;
                }
            }
            if (i != min) {
                //swap the min element, moving it to its proper place in the list.
                int temp = list[min];
                list[min] = list[i];
                list[i] = temp;
            }
        }

    }

    public static void main(String[] args) {
        Integer[] list = new Integer[5];
        list[0] = 32;
        list[1] = 24;
        list[2] = 235;
        list[3] = 1;
        list[4] = 0;
        sortNumbers(list);
        for (int i = 0;i< list.length;i++)     {
            System.out.println(list[i]);
        }
    }
}