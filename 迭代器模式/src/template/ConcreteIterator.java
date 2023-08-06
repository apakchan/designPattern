package template;

import java.util.Iterator;

public class ConcreteIterator implements Iterator {

    private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate){
        this.aggregate  = aggregate;
    }

    public Object first(){
        return this.aggregate.getByIndex(0);
    }

    @Override
    public boolean hasNext() {
        return this.current < aggregate.getCount();
    }

    @Override
    public Object next() {
        if(hasNext()){
            return this.aggregate.getByIndex(current++);
        }
        return null;
    }
}
