import java.util.*;

class SubarraysofSize {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4, 2, 3};
        int k = 3;

        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            // 1. Add element
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);

            // 2. Shrink window if size > k
            if (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }

                left++;
            }

            // 3. Check when window size == k
            if (right - left + 1 == k) {
                if (map.size() == k) {
                    System.out.println("Valid subarray from index " + left + " to " + right);
                }
            }
        }
    }
}