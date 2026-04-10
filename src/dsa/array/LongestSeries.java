import java.util.HashSet;

class LongestSeries{

    public static int cons(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashSet<Integer> map = new HashSet<>();
        for(int num : nums){
            map.add(num);
        }
        int longestStreak = 0;
        for(int nip : map){
            if(!map.contains(nip - 1)) {
                int currentNum = nip;
                int currentStreak = 1;
                while (map.contains(currentNum + 1)){
                    currentNum++;
                    currentStreak++;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
    public static void main(String[] args){
        int[] nums = {2,20,4,10,3,4,5};
        int result = cons(nums);
        System.out.println(result);

    }
}