class NumberOfVowels {
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;

        int left = 0;
        int right = 0;

        int currentVowels = 0;
        int maxVowels = 0;

        while (right < s.length()) {

            // ➕ add right character
            if (isVowel(s.charAt(right))) {
                currentVowels++;
            }


            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) {
                    currentVowels--;
                }
                left++;
            }


            if (right - left + 1 == k) {
                maxVowels = Math.max(maxVowels, currentVowels);
            }

            right++;
        }

        System.out.println("Maximum vowels: " + maxVowels);
    }

    // helper function
    static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}