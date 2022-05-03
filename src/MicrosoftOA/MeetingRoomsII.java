package MicrosoftOA;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static int meetingRooms(int[][] intervals){
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int[] interval: intervals){
            if(!pq.isEmpty() && pq.peek()<=interval[0]){
                pq.poll();
            }
            pq.add(interval[1]);
        }
        return pq.size();
    }
    public static void main(String[] args){
        int[][] intervals = {{0,30},{5,10},{15,20}};
        System.out.println(meetingRooms(intervals));
    }
}
