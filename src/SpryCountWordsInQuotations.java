//Algorithm
//
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpryCountWordsInQuotations {

    public static Map<String,Integer> spryCountWordsInQuotations(String path) throws IOException {

        Map<String,Integer> map = new LinkedHashMap<>();

        //Little Confuse on Example 1 Outcome I assume it has to be sorted by occurence and by alphabetic order for Example 1....
        //Map<String,Integer> map = new TreeMap<>(Collections.reverseOrder());
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        StringBuilder sb = new StringBuilder();
        while ((st = br.readLine()) != null) {
            //System.out.println(st);
            sb.append(st);
        }
        String toCheck = sb.toString();
        toCheck = toCheck.replaceAll("[\\u201C\\u201D]", "\"");
            //System.out.println(st);
            Pattern doubleQuotes = Pattern.compile("\"([^\"]*)\"");
            Matcher m = doubleQuotes.matcher(toCheck);
            while (m.find()) {
                //System.out.println(m.group(0));
                String s = m.group(0).replaceAll("^\"|\"$", "");
                s= s.toLowerCase();
                String words[] = s.split(" ");
               for (int i=0;i<words.length;i++){
                   words[i] = words[i].replaceAll("[^a-zA-Z0-9'-]", "");
                   //System.out.println( words[i]);
                   if(map.containsKey(words[i])){
                       map.put(words[i],map.get(words[i]) + 1);
                   } else {
                       Pattern p = Pattern.compile( "[0-9]" );
                       Matcher match = p.matcher( words[i]);
                       if(match.find()){
                           continue;
                       }
                       map.put(words[i], 1);
                   }
                }
            }

        Map<String,Integer> sorted= sortByValue(map);
        for (String name : sorted.keySet()){
            System.out.println( name + " -> " + sorted.get(name));
        }
        return sorted;
    }

        private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {
            List<Map.Entry<String, Integer>> list =
                    new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());
            Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
                public int compare(Map.Entry<String, Integer> o1,
                                   Map.Entry<String, Integer> o2) {
                    return (o2.getValue()).compareTo(o1.getValue());
                }
            });
            Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
            for (Map.Entry<String, Integer> entry : list) {
                sortedMap.put(entry.getKey(), entry.getValue());
            }
            return sortedMap;
        }

    public static void main (String args[]) throws IOException {
        String path = "/Users/Piyusman/spryhealth3.txt";
        spryCountWordsInQuotations(path);
    }


}

