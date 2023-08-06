package example;

public abstract class KFC {
    public abstract void cook1();
    public abstract void cook2();
    public abstract Product getProduct();
}

class HuaiAnKFC extends KFC{
    private Product product = new Product();

    @Override
    public void cook1() {
        product.add("放淮安的调料");
    }

    @Override
    public void cook2() {
        product.add("用淮安的油炸");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}

class NanJingKFC extends KFC{
    private Product product = new Product();

    @Override
    public void cook1() {
        product.add("放南京的调料");
    }

    @Override
    public void cook2() {
        product.add("用南京的油炸");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
