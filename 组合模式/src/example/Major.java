package example;

/**
 * @author 陈柏宇
 * 专业类
 */

public class Major extends Academy{
    public Major(String name) {
        super(name);
    }

    @Override
    public void add(Academy university) {
        System.out.println("专业无法再分类了！");
    }

    @Override
    public void remove(Academy university) {
        System.out.println("专业无法删除分类了！");
    }

    @Override
    public void display(int depth) {
        StringBuffer buffer = new StringBuffer(depth);
        for (int i=0;i<depth;i++)
            buffer.append('-');
        System.out.println(buffer + name);
    }

    @Override
    public void duty() {
        System.out.println(name + "专业,负责专业人才培养。");
    }
}
