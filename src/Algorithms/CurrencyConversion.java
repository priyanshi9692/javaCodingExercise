package Algorithms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CurrencyConversion {
    public static class Currency{
        String toCurr;
        String fromCurr;
        double factor;

        Currency(String fromCurr, String toCurr, double factor){
            this.fromCurr = fromCurr;
            this.toCurr = toCurr;
            this.factor = factor;
        }
    }
    public static HashMap<String, HashMap<String, Double>> map ;
    public static double convertCurrency(List<Currency> currencies, List<String> convert){
            map = new HashMap<>();
            for(Currency currency: currencies){
                String toCurrency = currency.toCurr;
                String fromCurrency = currency.fromCurr;
                double value = currency.factor;

                map.putIfAbsent(toCurrency, new HashMap<>());
                map.putIfAbsent(fromCurrency, new HashMap<>());

                map.get(fromCurrency).put(toCurrency, value);
                map.get(toCurrency).put(fromCurrency, (1.0/value));
            }

            double ans = 0;
            String convertFrom = convert.get(0);
            String convertTo = convert.get(1);

            if(!map.containsKey(convertFrom) || !map.containsKey(convertTo)){
                ans = -1.0;
            }else if(convertFrom.equals(convertTo)){
                ans = 1;
            }else{
                HashSet<String> visited = new HashSet<>();
                ans = recurseOnGraph(visited, convertFrom, convertTo, 1);
            }

            return ans;
    }

    public static double recurseOnGraph(HashSet<String> visited, String convertFrom, String convertTo, double value){
        visited.add(convertFrom);

        if(convertFrom.equals(convertTo)){
            return value;
        }

        for(String nextNode: map.get(convertFrom).keySet()){
            if(visited.contains(nextNode)){
                continue;
            }
            double ans = recurseOnGraph(visited,nextNode,convertTo,value*map.get(convertFrom).get(nextNode));

            if(ans != -1){
                return ans;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Currency c1 = new Currency("USD","JPY",110);
        Currency c2 = new Currency("USD","AUD",1.45);
        Currency c3 = new Currency("JPY","GBP",0.0070);

        List<Currency> list = new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);

        List<String> currencyConvert = new ArrayList<>();
        currencyConvert.add("GBP");
        currencyConvert.add("AUD");

        System.out.println("Converted rate: "+ convertCurrency(list, currencyConvert));
    }
}
