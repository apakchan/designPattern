package template;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate extends Aggregate{

    private List<Object> list = new ArrayList<>();
    private int count = 0;

    public int getCount(){
        return this.count;
    }

    public Object getByIndex(int index){
        if(this.count < index + 1){
            return null;
        }
        return  this.list.get(index);
    }

    public void insert(Object obj){
        this.list.add(obj);
        count ++ ;
    }

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
}
