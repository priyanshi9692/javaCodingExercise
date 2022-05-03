package Neetcode.Graphs;

import com.sun.tools.javac.util.ListBuffer;

import javax.print.attribute.IntegerSyntax;
import java.util.*;

public class CourseSchedule {
    public static boolean courseSchedule(int numCourses, int[][] prerequisites){
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int[] indegree = new int[numCourses];

        for(int[] prereq: prerequisites){
            int source = prereq[1];
            int dest = prereq[0];

            List<Integer> list = map.getOrDefault(source, new ArrayList<>());
            list.add(dest);
            map.put(source, list);
            indegree[dest]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i =0; i<indegree.length; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int count = 0;

        while(!queue.isEmpty()){
            int node = queue.remove();
            count++;

            if(map.containsKey(node)){
                List<Integer> neighbors = map.get(node);
                for(int neighbor: neighbors){
                    indegree[neighbor]--;
                    if(indegree[neighbor] == 0){
                        queue.add(neighbor);
                    }
                }
            }
        }
        return count == numCourses;
    }
    public static void main(String[] args){
        int[][] courses1 = {
                {1,0},
                {0,1}
        };

        int[][] courses2 = {
                {1,0}
        };

        System.out.println("Can complete course: "+ courseSchedule(2, courses1));
        System.out.println("Can complete course: "+ courseSchedule(2, courses2));
    }

}
