package NumericProblems;

import java.util.*;

public class SetAccordingToLevels {
    public  String[] codingScoreReportPercent(int[] scores) {
        List<String> result = new ArrayList<String>();
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Poor",0);
        map.put("Fair",0);
        map.put("Good",0);
        map.put("Excellent",0);
        map.put("Elite",0);
        for(int score : scores){
            if(score<600){
                map.put("Poor",map.get("Poor")+1);
            } else if(score<700){
                map.put("Fair",map.get("Fair")+1);
            } else if (score <750){
                map.put("Good",map.get("Good")+1);
            } else if (score<800){
                map.put("Excellent",map.get("Excellent")+1);
            } else if(score>=800){
                map.put("Elite",map.get("Elite")+1);
            }

        }
        ArrayList<Levels> l = new ArrayList<>();
        for(String key : map.keySet()){
            double value = map.get(key);
            if(map.get(key) > 0){

                double percent = (value/scores.length)*100;
                Levels levels = new Levels(key,percent);
                l.add(levels);
            }
        }
        Collections.sort(l,new CountComparator());
        for(Levels le : l ){
            result.add(le.level + ": " +  String.format("%.2f",le.count) +"%");
        }

        return result.toArray(new String[result.size()]);



    }

    class Levels{
        String level;
        double count;

        public Levels(String level, double count){
            this.level = level;
            this.count = count;
        }




    }

    class CountComparator  implements Comparator<Levels> {
        @Override
        public  int compare(Levels o1, Levels o2){
            double count = o2.count-o1.count;
            if((int)count == 0){
                return o1.level.compareTo(o2.level);
            }
            return (int)count;
        }

    }
    public static void main(String[] args){
        SetAccordingToLevels obj = new SetAccordingToLevels();
        int[] scores = {350, 708, 908, 605, 725};

        String[] result = obj.codingScoreReportPercent(scores);

        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }

}
