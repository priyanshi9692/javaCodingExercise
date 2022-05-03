package MicrosoftOA;

import sun.awt.image.ImageWatched;

import java.util.*;

public class CourseScheduleII {
    public static int[] courseScheduleII(int numCourses, int[][] prerequisites){
        HashMap<Integer, List<Integer>> adjacencyList = new HashMap<>();
        int[] indegree = new int[numCourses];
        int[] result = new int[numCourses];

        for(int[] prereq: prerequisites){
            int source =  prereq[1];
            int destination = prereq[0];
            List<Integer> list = adjacencyList.getOrDefault(source, new ArrayList<>());
            list.add(destination);
            adjacencyList.put(source,list);
            indegree[destination]++;
        }
        Queue<Integer> queue = new LinkedList<>();

        for(int i =0; i<numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int resultIndex = 0;
        while(!queue.isEmpty()){
            int node = queue.remove();
            result[resultIndex++] = node;

            if(adjacencyList.containsKey(node)){
                for(Integer neighbor: adjacencyList.get(node)){
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
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};

        int[] result = courseScheduleII(4, prerequisites);

        for(int i =0; i<result.length; i++){
            System.out.print(result[i]+", \t");
        }
    }
}
