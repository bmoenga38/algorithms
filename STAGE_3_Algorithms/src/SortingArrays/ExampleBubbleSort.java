package SortingArrays;

public class ExampleBubbleSort {
    int temp;
    int[] nums = {200, 80, 27, 10, 35, 5, 42, 44};
    boolean sorted;

    ExampleBubbleSort() {

        while (sorted == false) {
            sorted = true;

            for (int i = 0; i < nums.length - 1; i++)
                if (nums[i] > nums[i + 1]) {

                    temp = nums[i + 1];

                    nums[i + 1] = nums[i];

                    nums[i] = temp;

                    sorted = false;
                }
        }//while

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + "\t");
        }
    }

    public static void main(String[] args) {
        new ExampleBubbleSort();
    }
}