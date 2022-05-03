package MicrosoftOA;

import java.util.*;

public class CourseSchedule {

    public static boolean courseSchedule(int numCourses, int[][] prerequisites){
        HashMap<Integer, List<Integer>> adjacencyList = new HashMap<>();
        int[] indegree = new int[numCourses];
        for(int[] prereq: prerequisites){
            int source = prereq[1];
            int dest = prereq[0];
            List<Integer> list = adjacencyList.getOrDefault(source, new ArrayList<>());
            list.add(dest);
            adjacencyList.put(source, list);
            indegree[dest]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int count = 0;

        while(!queue.isEmpty()){
            int node = queue.remove();
            count++;
            if(adjacencyList.containsKey(node)){
                for(Integer neighbor: adjacencyList.get(node)){
                    indegree[neighbor]--;
                    if(indegree[neighbor] == 0){
                        queue.add(neighbor);
                    }
                }
            }
        }

        return count== numCourses;
    }
    public static void main(String[] args){
        int[][] prerequisites = {{1,0},{0,2},{3,1},{2,3}};
        System.out.println(courseSchedule(4, prerequisites));
    }
}
