package template;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */

public class Composite extends Component{
    List<Component> list = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        list.add(component);
    }

    @Override
    public void remove(Component component) {
        list.remove(component);
    }

    @Override
    public void show(int depth) {
        StringBuffer buffer = new StringBuffer(depth);
        for (int i=0;i<depth;i++)
            buffer.append('-');
        System.out.println(buffer + name);

        for (Component component : list) {
            component.show(depth + 2);
        }
    }
}
