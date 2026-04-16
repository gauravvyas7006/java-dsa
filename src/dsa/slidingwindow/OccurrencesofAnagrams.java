import java.util.Arrays;

class OccurrencesofAnagrams {
    public static void main(String[] args) {
        String text = "cbaebabacd";
        String pattern = "abc";

        int k = pattern.length();
        int left = 0, right = 0;

        int[] freq = new int[26];
        int[] window = new int[26];

        // ✅ FIX: use pattern, not text
        for (char c : pattern.toCharArray()) {
            freq[c - 'a']++;
        }

        while (right < text.length()) {

            // add current char
            window[text.charAt(right) - 'a']++;

            // shrink if needed
            if (right - left + 1 > k) {
                window[text.charAt(left) - 'a']--;
                left++;
            }

            // ✅ check only when window size == k
            if (right - left + 1 == k && Arrays.equals(freq, window)) {
                System.out.println("Anagram at index: " + left);
            }

            right++;
        }
    }
}