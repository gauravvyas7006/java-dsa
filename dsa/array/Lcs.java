import java.util.HashMap;

class Lcs{
    public static void main(String[] args){
        int[] nums = {2,20,4,10,3,4,5};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
                map.put(nums[i], map.getOrDefault(nums[i],0) + 1);
            
        }
        int maxCount = 0;
        int answer = -1;

        for(int key : map.keySet()){
            int freq = map.get(key);
            System.out.println(freq);
            System.out.println(key);
            System.out.println("--------");
            if(freq > maxCount){

                maxCount = freq;
                answer = key;
            }
        }

        System.out.println(answer);
        }
}