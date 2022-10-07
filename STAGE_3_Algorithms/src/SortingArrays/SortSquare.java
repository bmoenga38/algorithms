package SortingArrays;

public class SortSquare {
    public static void main(String[] args) {
        int [] a = sortSquareArray(new int[]{-6, -4, 1, -2, 3, 5});
        for (int i : a) {
            System.out.println(i + "");
        }
    }

   // @org.jetbrains.annotations.Contract(pure = true)
    private static int[] sortSquareArray(int[] arr) {
        int [] result = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        for (int i = arr.length-1; i >=0 ; i--) {
            if (Math.abs(arr[left]) > arr[right]) {
                result[i] = arr[left] * arr[left];
                left++;
            }
            else{
                    result[i] = arr[right] * arr[right];
                    right++;
                }

        }
        return result;
    }
}
