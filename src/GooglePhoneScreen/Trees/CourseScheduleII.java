package GooglePhoneScreen.Trees;

import java.util.*;

public class CourseScheduleII {
    public static int[] courseSchedule(int numCourses, int[][]prerequisites){
        int[] indegree = new int[numCourses];
        HashMap<Integer, List<Integer>>adjList = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();
        int[] result = new int[numCourses];

        for(int[] prereq: prerequisites){
            int source = prereq[1];
            int destination = prereq[0];
            List<Integer> list = adjList.getOrDefault(source, new ArrayList<>());
            list.add(destination);
            adjList.put(source, list);
            indegree[destination]++;
        }

        for(int i = 0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int resultIndex= 0;
        while(!queue.isEmpty()){
            int node = queue.remove();
            result[resultIndex++] = node;
            if(adjList.containsKey(node)){
                for(Integer neighbor: adjList.get(node)){
                    indegree[neighbor]--;
                    if(indegree[neighbor] == 0){
                        queue.add(neighbor);
                    }
                }
            }
        }
        if(resultIndex == numCourses){
            return result;
        }
        return new int[0];
    }

    public static void main(String[] args){
        int[][] prereqs = {
                {1,0},
                {2,0},
                {3,1},
                {3,2}
        };

        System.out.println("Order in which courses should be taken: "+ Arrays.toString(courseSchedule(4, prereqs)));

    }
}
