package SortingArrays;

public class SelectionSortArray {
    int [] data = {14,33,27,10,35,19,42,44,1};
    int temp;

    public SelectionSortArray(){

        for (int i= 0; i<data.length;  i++){
            int minIndex = 1;

            for (int j = i +1; j < data.length; j++) {
                if (data[j] <data [minIndex]){
                    minIndex = j;
                }//for
            }//for

            temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }//for i

        // for Each loop;
        for (int n :data) {
            System.out.print(n +" ");
        }
    }



    public static void main(String[] args) {
        new SelectionSortArray();
    }
}
