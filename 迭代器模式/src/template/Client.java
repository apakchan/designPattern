package template;

import java.util.HashMap;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate concreteAggregate = new ConcreteAggregate();
        Iterator iterator = concreteAggregate.CreateIterator();
        concreteAggregate.insert(1);
        concreteAggregate.insert(2);
        concreteAggregate.insert(2);
        concreteAggregate.insert("1");
        concreteAggregate.insert("adsa");
        concreteAggregate.insert(new String("asd"));
        concreteAggregate.insert(new HashMap<>());
        concreteAggregate.insert("ads");
        concreteAggregate.insert(new int[]{1,2,3,45});
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
