import java.util.HashMap;
import java.util.*;
class LongestRepeatingCharacter {
    public static void main(String[] args){
        String s = "AABABBA";
        int k = 1;
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for(int right =0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar,0) + 1);
            maxFreq = Math.max(maxFreq,map.get(currentChar));
            while ((right - left + 1) - maxFreq > k){
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar) - 1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        System.out.println(maxLength);
    }
}