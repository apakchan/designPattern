package example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈柏宇
 * 大学类，子节点是分校区或者学院
 */

public class University extends Academy {

    List<Academy> list = new ArrayList<>();

    public University(String name) {
        super(name);
    }

    @Override
    public void add(Academy academy) {
        list.add(academy);
    }

    @Override
    public void remove(Academy academy) {
        list.remove(academy);
    }

    @Override
    public void display(int depth) {
        StringBuffer buffer = new StringBuffer(depth);
        for (int i=0;i<depth;i++)
            buffer.append('-');
        System.out.println(buffer + name);
        for (Academy academy : list) {
            academy.display(depth + 2);
        }
    }

    @Override
    public void duty() {
        System.out.println(name + "大学，负责管理学院。");
        for (Academy academy : list) {
            academy.duty();
        }
    }
}
