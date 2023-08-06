package proxy;

/**
 * @author 陈柏宇
 * 追求者 动作的意愿发起者
 */

public class Pursuit extends IGivePresent{
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void giveDoll() {
        System.out.println( "送你玩偶,我亲爱的" + mm.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println( "送你巧克力,我亲爱的" + mm.getName());
    }

    @Override
    public void giveFlower() {
        System.out.println( "送你鲜花,我亲爱的" + mm.getName());
    }
}
