package dsa.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class frequent{

    public static int[] mostFrequent(int[] arr,int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Integer>[] bucket = new ArrayList[arr.length + 1];
        for (int key : map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] resul = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0 && index < k; i--) {

            if (bucket[i] != null) {

                for (int num : bucket[i]) {
                    resul[index] = num;
                    index++;

                    // Stop when k elements found
                    if (index == k) {
                        break;
                    }
                }
            }
        }
        return resul;
    }

    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,3};
        int k = 2;
        int[] result = mostFrequent(arr,k);
        System.out.println(result[0]+""+result[1]);

    }
}