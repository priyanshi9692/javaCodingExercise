package GooglePhoneScreen.Trees;

import java.sql.Array;
import java.util.*;

public class EvaluateDivision {

    private static HashMap<String, HashMap<String, Double>> map;
    public static double[] calEquations(List<List<String>> equations, double[] values, List<List<String>> queries){
        map = new HashMap<>();

        for(int i = 0; i<equations.size(); i++){
            String a = equations.get(i).get(0);
            String b = equations.get(i).get(1);

            map.putIfAbsent(a, new HashMap<>());
            map.putIfAbsent(b, new HashMap<>());

            map.get(a).put(b, values[i]);
            map.get(b).put(a, 1.0/values[i]);
        }

        double[] result = new double[queries.size()];

        for(int i =0; i<queries.size(); i++){
            String a = queries.get(i).get(0);
            String b = queries.get(i).get(1);

            if(!map.containsKey(a) || !map.containsKey(b)){
                result[i] = -1;
            }else if(a.equals(b)){
                result[i] = 1;
            }else{
                HashSet<String> visited = new HashSet<>();
                result[i] = dfs(visited, a, b, 1);
            }

        }
        return result;

    }
    public static double dfs(HashSet<String> visited, String curr, String target, double value){
        visited.add(curr);
        if(curr.equals(target)){
            return value;
        }

        for(String nextStr: map.get(curr).keySet()){
            if(visited.contains(nextStr)){
                continue;
            }
            double ans = dfs(visited, nextStr, target, value * map.get(curr).get(nextStr));

            if(ans!= -1){
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        List<List<String>> equations = new ArrayList<>();
        List<String> equation0 = new ArrayList<>();
        equation0.add("a");
        equation0.add("b");
        equations.add(equation0);
        List<String> equation1 = new ArrayList<>();
        equation1.add("b");
        equation1.add("c");
        equations.add(equation1);
        double[] values = {2.0,3.0};

        List<List<String>> queries = new ArrayList<>();

        List<String> query0 = new ArrayList<>();
        query0.add("a");
        query0.add("c");
        queries.add(query0);
        List<String> query1 = new ArrayList<>();
        query1.add("b");
        query1.add("a");
        queries.add(query1);
        List<String> query2 = new ArrayList<>();
        query2.add("a");
        query2.add("e");
        queries.add(query2);
        List<String> query3 = new ArrayList<>();
        query3.add("a");
        query3.add("a");
        queries.add(query3);
        List<String> query4 = new ArrayList<>();
        query4.add("x");
        query4.add("x");
        queries.add(query4);

        System.out.println("Evaluate Division: "+ Arrays.toString(calEquations(equations, values, queries)));
    }
}
