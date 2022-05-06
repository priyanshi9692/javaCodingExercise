package Neetcode.Stack;

import java.util.HashMap;
import java.util.Stack;

public class Document {
    public static Layer[] layers = new Layer[10];
    public static Stack<Layer> stack;
    public static int index = 0;
    public Document(Layer[] layers){
        layers = layers;
        stack = new Stack<>();
    }

    public static Layer layerById(String id){
        for(int i = 0; i<layers.length; i++){
            String layerId = layers[i].id;
            if(layerId.equals(id)){
                return layers[i];
            }
        }
        return null;
    }

    public static void apply(String id, String property, String value){
        HashMap<String, String> properties = new HashMap<>();
        properties.put(property, value);
        layers[index] = new Layer(id, properties);
        index++;
        stack.push(layers[index]);
    }

    public static void undo(){
        if(!stack.isEmpty()){
            stack.pop();
        }
    }

}
