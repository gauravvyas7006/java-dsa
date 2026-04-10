import java.util.*;

public class Enc {

    public static String encode(List<String> strs) {
        StringBuilder result = new StringBuilder();
        for (String str : strs) {
            result.append(str.length());
            result.append("#");
            result.append(str);
        }
        return result.toString();
    }

    public static List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(s.substring(i, j));
            j++;

            String word = s.substring(j, j + length);
            result.add(word);

            i = j + length;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("neet", "code", "love", "you");

        String encoded = encode(input);
        System.out.println(encoded);

        List<String> decoded = decode(encoded);
        System.out.println(decoded);
    }
}