package proxy;

/**
 * @author 陈柏宇
 * 代理，用来发出追求者想发出的动作
 */

public class Proxy extends IGivePresent{
    Pursuit pursuit;

    public Proxy(SchoolGirl mm) {
        this.pursuit = new Pursuit(mm);
    }

    @Override
    public void giveDoll() {
        pursuit.giveDoll();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }

    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }
}
