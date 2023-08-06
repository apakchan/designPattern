package template;

import java.util.HashMap;
import java.util.Hashtable;

public class FlyweightFactory {
    private HashMap<String,Flyweight> flyweights = new HashMap<>();

    public FlyweightFactory(){
        flyweights.put("X",new ConcreteFlyweight());
        flyweights.put("Y",new ConcreteFlyweight());
        flyweights.put("Z",new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return flyweights.get(key);
    }
}
