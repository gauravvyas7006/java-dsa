class Palindrome {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not a Palindrome");
    }
}