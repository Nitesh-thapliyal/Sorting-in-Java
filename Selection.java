import java.util.Arrays;

public class Selection {

    public static void main(String[] args) {
        int[] arr = {4,3,5,7,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - 1 - i;
            int max = max_limit(nums, last);
            swap(nums, max, last);
        }
    }

    private static int max_limit(int[] nums, int end) {
        int max = 0;
        for (int i = 0; i <= end; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }

    private static void swap(int[] nums, int j, int i) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}