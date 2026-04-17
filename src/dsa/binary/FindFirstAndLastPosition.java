package dsa.binary;
class FindFirstAndLastPosition{
    public static void main(String[] args){
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int left = 0;
        int right = nums.length-1;
        int first = -1;
        int last = -1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                first = mid;
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                last = mid;
                left = mid + 1;   // move right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(first);
        System.out.println(last);
    }
}