import java.util.HashMap;

class LongestSubstring {
    public static void main(String[] args) {
        String s = "zxyzxy";

        // Stores character and its last seen index
        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;      // Start of the current window
        int maxLength = 0;  // Length of the longest substring

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // If the character is already seen and is within the current window
            if (map.containsKey(current) && map.get(current) >= start) {
                // Move the start just after the previous occurrence
                start = map.get(current) + 1;
            }

            // Update the character's latest index
            map.put(current, i);

            // Calculate the current window length 
            int currentLength = i - start + 1;

            // Update the maximum length
            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println("Length of Longest Substring: " + maxLength);
    }
}