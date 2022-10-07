package SortingArrays;

public class BubbleSort {
    int temp;
    int [] nums = {200, 80, 27, 10, 35, 5, 42, 44 , 3, 2, 49};

    boolean needNextPass = true;

    BubbleSort() {

        while (needNextPass) {

            needNextPass = false;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i +1]) {

                    temp = nums[i];

                    nums[i] = nums[i + 1];

                    nums[i + 1] = temp;

                    needNextPass = true;
                }//if ends here
            }//for loop
        }
        for(int arr : nums){
            System.out.print(arr + " ");
        }
    }

    public static void main(String[] args) {
        new BubbleSort();
    }
}
