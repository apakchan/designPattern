package example;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象手机类
 */

public abstract class Phone {
    protected List<Soft> softs = new ArrayList<>();

    public void add(Soft soft){
        softs.add(soft);
    }

    public abstract void run();
}
