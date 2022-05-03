package Neetcode.Graphs;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.HashMap;
import java.util.*;

public class CourseScheduleII {
    public static int[] courseScheduleII(int numCourses, int[][]prerequisites){
        if(prerequisites == null || prerequisites.length == 0){
            return null;
        }
        HashMap<Integer, List<Integer>> adjLists = new HashMap<Integer, List<Integer>>();
        int[]indegree = new int[numCourses];

        // Make AdjList
        for(int[] prereq: prerequisites){
            int source = prereq[1];
            int dest = prereq[0];

            List<Integer> list = adjLists.getOrDefault(source, new ArrayList<>());
            list.add(dest);
            adjLists.put(source, list);

            indegree[dest]++;
        }
        Queue<Integer> queue = new LinkedList<>();

        // add all the courses with indegree zero into the queue

        for(int i = 0; i<indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int[] result = new int[numCourses];
        int j = 0;
        while(!queue.isEmpty()){
            int node = queue.remove();
            result[j++] = node;

            if(adjLists.containsKey(node)){
                List<Integer> neighbors = adjLists.get(node);
                for(int neighbor: neighbors){
                    indegree[neighbor]--;
                    if(indegree[neighbor] == 0){
                        queue.add(neighbor);
                    }
                }
            }
        }
        if(j == numCourses){
            return result;
        }
        return null;
    }
    public static void main(String[] args){
        int[][] courses = {
                {1,0},
                {2,0},
                {3,1},
                {3,2}
        };
        System.out.println("Topological sort: "+ Arrays.toString(courseScheduleII(4, courses)));
    }
}
