package Neetcode.Stack;

import java.util.HashMap;

public class Layer {
    public String id;
    public HashMap<String, String> properties;

    Layer(String id, HashMap<String, String> properties){
        this.id = id;
        this.properties = properties;
    }
}
