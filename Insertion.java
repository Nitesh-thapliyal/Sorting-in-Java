import java.util.Arrays;

public class Insertion {

    public static void main(String[] args) {
        int[] arr = {4,3,5,7,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (nums[j] < nums[j-1]) {
                    swap(nums, j-1, j);
                } else {
                    break;
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