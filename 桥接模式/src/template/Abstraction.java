package template;

/**
 * 抽象调用类
 */

public abstract class Abstraction {
    protected Implementor implementor;

    public void setImplementor(Implementor implementor){
        this.implementor = implementor;
    }

    public abstract void run();
}
