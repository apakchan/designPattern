package template;

public class Leaf extends Component{
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("叶节点无法添加子节点");
    }

    @Override
    public void remove(Component component) {
        System.out.println("叶节点没有子节点");
    }

    @Override
    public void show(int depth) {
        StringBuffer buffer = new StringBuffer(depth);
        for (int i=0;i<depth;i++)
            buffer.append('-');
        System.out.println(buffer + name);
    }
}
