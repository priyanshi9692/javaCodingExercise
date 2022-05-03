package GooglePhoneScreen.Arrays;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRoomsII {
    public static int rooms(int[][] intervals){
        Arrays.sort(intervals, (a, b)->Integer.compare(a[0],b[0]));

        PriorityQueue<Integer> roomCount = new PriorityQueue<>();

        for(int[] interval: intervals){
            if(!roomCount.isEmpty() && roomCount.peek()<= interval[0]){
                roomCount.poll();
            }
            roomCount.add(interval[1]);
        }
        return roomCount.size();
    }

    public static void main(String[] args){
        int[][] intervals = {
                {0,30},
                {5,10},
                {15,20}
        };
        System.out.println("Required rooms: "+ rooms(intervals));
    }
}
