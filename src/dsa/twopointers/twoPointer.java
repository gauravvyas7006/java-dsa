import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class twoPointer{
    public static void main(String[] args){
        int[] arr = {-4,-1,-1,0,1,2,3};
        List<List<Integer>> map = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++){
            if(i > 0 && arr[1] == arr[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = arr.length-1;
            while (left < right){
                int sum =  arr[i] + arr[left] + arr[right];
                if(sum == 0){
                    map.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    left++;
                    right--;


                    while (left < right && arr[left] == arr[left - 1]) {
                        left++;
                    }


                    while (left < right && arr[right] == arr[right + 1]) {
                        right--;
                    }
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(map);
    }
}