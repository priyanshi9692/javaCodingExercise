package MicrosoftOA;

import java.util.HashMap;

public class LRUCache {

    public class DL{
        int key;
        int value;
        DL left;
        DL right;
    }
    private HashMap<Integer, DL>map;
    private DL start;
    private DL end;
    private final int CACHESIZE = 4;
     LRUCache(){
        map = new HashMap<>();
        start = null;
        end = null;
    }

    public int getValue(int key ){
         int value = -1;
         if(map.containsKey(key)){
             DL curr = map.get(key);
             value =  curr.value;
             removeValue(curr);
             addToTop(curr);
         }
         return value;
    }

    public void putValue(int key, int value){
         if(map.containsKey(key)){
             DL curr = map.get(key);
             curr.value = value;
             addToTop(curr);
         }
         DL newElement = new DL();
         newElement.key = key;
         newElement.value =value;
         newElement.left = null;
         newElement.right = null;
         if(map.size()>CACHESIZE){
             map.remove(end.key);
             removeValue(end);
             map.put(key, newElement);
             addToTop(newElement);
         }else{
             map.put(key, newElement);
             addToTop(newElement);
         }
    }

    public void addToTop(DL element){
         element.right = start;
         if(start!= null){
             element.left = null;
             start.left = element;
         }
         start = element;
         if(end == null){
             end = start;
         }
    }

    public void removeValue(DL element){
         if(element.left!= null){
             element.left.right = element.right;
         }else{
             start = element.right;
         }
         if(element.right!= null){
             element.right.left = element.left;
         }else{
             end = element.left;
         }
    }

    public static void main(String[] args){
         LRUCache lru = new LRUCache();

         lru.putValue(1,1);
        lru.putValue(10, 15);
        lru.putValue(15, 10);
        lru.putValue(10, 16);
        lru.putValue(12, 15);
        lru.putValue(18, 10);
        lru.putValue(13, 16);

        System.out.println(lru.getValue(1));
        System.out.println(lru.getValue(10));
        System.out.println(lru.getValue(15));
    }
}

