import java.util.ArrayList;
import java.util.List;

class AverageofSubarray {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        int left = 0;
        int right = 0;
        int sum = 0;
        List<Integer> map = new ArrayList<>();

        while (right < arr.length){

            sum += arr[right];

            if(right - left + 1 == k){
                int mean = sum / k;
                map.add(mean);

                sum -= arr[left];
                left++;
            }

            right++;
        }

        for(int x : map){
            System.out.println(x);
        }
    }
}