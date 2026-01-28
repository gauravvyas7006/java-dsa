import java.util.*;

public class MeetingRooms {
    public int minMeetingRooms(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int[] interval : intervals) {
            if (!heap.isEmpty() && heap.peek() <= interval[0]) heap.poll();
            heap.offer(interval[1]);
        }
        return heap.size();
    }
}
