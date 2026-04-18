public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }
        while (insertPos < nums.length) nums[insertPos++] = 0;
    }

    public static void main(String[] args) {
        MoveZeroes mz = new MoveZeroes();
        int[] arr = {0, 1, 0, 3, 12};
        mz.moveZeroes(arr);
        for (int n : arr) System.out.print(n + " "); // 1 3 12 0 0
    }
}
