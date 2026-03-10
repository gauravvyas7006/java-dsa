public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ra.rotate(arr, 3);
        for (int n : arr) System.out.print(n + " "); // 5 6 7 1 2 3 4
    }
}
