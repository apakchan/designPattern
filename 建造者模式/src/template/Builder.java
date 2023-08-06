package template;

/**
 * @author 陈柏宇
 * 建造者模式
 * 封装了工艺所必需的流程
 *
 * Builder是为了创建一个Product对象的各个部件指定的抽象接口。
 */

public abstract class Builder {
    public abstract void BuildPartA();
    public abstract void BuildPartB();
    public abstract Product getResult();
}

class ConcreteBuilder1 extends Builder{
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.add("部件A");
    }

    @Override
    public void BuildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
class ConcreteBuilder2 extends Builder{
    private Product product = new Product();
    @Override
    public void BuildPartA() {
        product.add("部件X");
    }

    @Override
    public void BuildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}