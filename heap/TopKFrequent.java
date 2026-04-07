import java.util.*;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.merge(n, 1, Integer::sum);
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(freq::get));
        for (int key : freq.keySet()) {
            heap.offer(key);
            if (heap.size() > k) heap.poll();
        }
        return heap.stream().mapToInt(i -> i).toArray();
    }
}
