import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        int[] arr = {4,3,5,7,2};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    // length is 5, 4 [0, 1, 2, 3, 4]
    // O(N^2)
    public static void bubble(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j, j-1);
                }
            }
        }
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}