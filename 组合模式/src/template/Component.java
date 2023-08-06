package template;

/**
 * @author 陈柏宇
 * 组合模式，适合有层次的结构使用，典型的树形结构。
 */

public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }
    //增加子节点
    public abstract void add(Component component);
    //删除子节点
    public abstract void remove(Component component);
    //展示自己和所有子节点
    public abstract void show(int depth);
}
