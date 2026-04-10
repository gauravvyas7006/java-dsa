import java.util.*;

class groupAnagrams{
    public static void main(String[] args){
        String[] anagram = {"act","pots","tops","cat","stop","hat"};
        HashMap<String, List<String>> map = new HashMap<>();
        for(String strs : anagram){
            char[] arr = strs.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }

            map.get(key).add(strs);
            System.out.println(key);
        }
        System.out.println(map.values());

    }
}