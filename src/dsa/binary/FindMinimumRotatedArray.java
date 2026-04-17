package dsa.binary;
class FindMinimumRotatedArray{
    public static void main(String[] args){
        int[] nums = {4,5,6,7,1,2,3};
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        System.out.println(nums[left]);
    }
}