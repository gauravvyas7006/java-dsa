import java.util.HashMap;

class twoSum{
    public int[] sumFunction(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(map.containsKey(compliment)){
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args){
        int[] nums = {2,7,4,6,9};
        int target = 11;
        twoSum sendNum = new twoSum();
        int[] checkIt = sendNum.sumFunction(nums,target);
        System.out.println(checkIt[0]+""+checkIt[1]);
    }
}