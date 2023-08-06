package templates;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> list = new ArrayList<>();

    public void add(Element element){
        this.list.add(element);
    }

    public void remove(Element element){
        this.list.remove(element);
    }

    public void accept(Visitor visitor){
        for (Element element : this.list) {
            element.accept(visitor);
        }
    }
}
