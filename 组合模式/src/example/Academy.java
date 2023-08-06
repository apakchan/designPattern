package example;

/**
 * @author 陈柏宇
 * 抽象大学
 */

public abstract class Academy {
    protected String name;

    public Academy(String name){
        this.name = name;
    }

    //增加子校区或者学院
    public abstract void add(Academy university);

    //删除子校区或者学院
    public abstract void remove(Academy university);

    //展示自己和子节点
    public abstract void display(int depth);

    //履行职责
    public abstract void duty();
}
