import java.util.*;

class FindAllAnagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> res = new ArrayList<>();

        if (s.length() < p.length()) {
            System.out.println(res);
            return;
        }

        int[] count = new int[26];

        // Step 1: fill frequency from p
        for (char c : p.toCharArray()) {
            count[c - 'a']++;
        }

        int left = 0;
        int right = 0;
        int k = p.length();

        // Step 2: sliding window
        while (right < s.length()) {

            // add right character
            count[s.charAt(right) - 'a']--;

            // when window size matches k
            if (right - left + 1 == k) {

                // check if all zero
                boolean allZero = true;
                for (int i = 0; i < 26; i++) {
                    if (count[i] != 0) {
                        allZero = false;
                        break;
                    }
                }

                if (allZero) {
                    res.add(left);
                }

                // remove left character
                count[s.charAt(left) - 'a']++;
                left++;
            }

            right++;
        }

        System.out.println(res);
    }
}