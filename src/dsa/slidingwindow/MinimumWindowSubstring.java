import java.util.HashMap;

class MinimumWindowSubstring{
    public static void main(String[] args){
        String s = "OUZODYXAZV";
        String t = "XYZ";
        HashMap<Character,Integer> map = new HashMap<>();
        int maxFreq = 0;
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        HashMap<Character,Integer> window = new HashMap<>();
        int left = 0;
        int right = 0;
        int formed = 0;
        int required = map.size();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while (right < s.length()){
            char c = s.charAt(right);
            window.put(c,window.getOrDefault(c,0)+1);
            if(map.containsKey(c) && window.get(c).intValue() == map.get(c).intValue()){
                formed++;
            }
            while (left <= right && formed == required){
                char ch = s.charAt(left);
                if(right - left + 1 < minLen){
                    minLen = right - left + 1;
                    start = left;
                }

                window.put(ch, window.get(ch) - 1);
                if (map.containsKey(ch) &&
                        window.get(ch) < map.get(ch)) {
                    formed--;
                }

                left++;
            }
            right++;
        }
        if (minLen == Integer.MAX_VALUE) {
            System.out.println("No valid substring found.");
        } else {
            System.out.println("Minimum Window Substring: "
                    + s.substring(start, start + minLen));
        }
    }
}