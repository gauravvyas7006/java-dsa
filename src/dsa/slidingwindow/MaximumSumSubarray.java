class MaximumSumSubarray{
    public static void main(String[] args){
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int previousSum = 0;
        int maxSum;
        int windowSum = 0;
        int left = 0;
        int right;
        for(right = 0; right < k;right++){
            windowSum += arr[right];
        }

        maxSum = windowSum;
        right = k - 1;
       // System.out.println(right);
        while (right < arr.length - 1){
            right++;
            windowSum += arr[right];
            windowSum -= arr[left];
            left++;
            maxSum = Math.max(maxSum,windowSum);
        }
        System.out.println(maxSum);
    }
}