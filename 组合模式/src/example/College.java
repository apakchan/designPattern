package example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 陈柏宇
 * 学院类，子类是专业类
 */

public class College extends Academy{
    List<Academy> majors = new ArrayList<>();

    public College(String name) {
        super(name);
    }

    @Override
    public void add(Academy academy) {
        majors.add(academy);
    }

    @Override
    public void remove(Academy academy) {
        majors.remove(academy);
    }

    @Override
    public void display(int depth) {
        StringBuffer buffer = new StringBuffer(depth);
        for (int i=0;i<depth;i++)
            buffer.append('-');
        System.out.println(buffer + name );
        for (Academy major : majors) {
            major.display(depth + 2);
        }
    }

    @Override
    public void duty() {
        System.out.println(name + "学院，负责管理各专业。");
        for (Academy major : majors) {
            major.duty();
        }
    }
}
