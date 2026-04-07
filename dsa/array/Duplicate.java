public class Duplicate { // ✅ class name matches file name

    public boolean hasDuplicate(int[] nums){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // ✅ Move main inside this class
    public static void main(String[] args){

        int[] nums = {1,2,3,3};

        Duplicate dup = new Duplicate();

        boolean isIt = dup.hasDuplicate(nums);

        System.out.println(isIt);
    }
}