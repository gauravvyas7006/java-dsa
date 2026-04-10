import static java.lang.Math.min;

class waterLEvel {
    public static void main(String[] args) {
        int[] height = {1, 7, 2, 5, 4, 7, 3, 6};
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            // Calculate water correctly
            int water = min(height[left], height[right]) * (right - left);

            // Update maximum water
            max = Math.max(max, water);

            // Move the pointer pointing to the shorter bar
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("Maximum Water: " + max);
    }
}