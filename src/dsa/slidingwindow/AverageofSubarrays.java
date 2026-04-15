import java.util.ArrayList;
import java.util.List;

class AverageofSubarrays {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;

        int left = 0;
        float windowSum = 0;
        List<Float> averages = new ArrayList<>();

        int right;


        for (right = 0; right < k; right++) {
            windowSum += arr[right];
        }


        averages.add(windowSum / k);


        while (right < arr.length) {
            windowSum += arr[right];
            windowSum -= arr[left];
            left++;

            averages.add(windowSum / k);
            right++;
        }

        System.out.println(averages);
    }
}