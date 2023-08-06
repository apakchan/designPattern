package proxy;

/**
 * @author 陈柏宇
 * 送礼物接口 代理者代理的我要送的礼物
 */

public abstract class IGivePresent {
    /**
     * 送玩偶 (不是Hong Kong的那位)
     */
    public abstract void giveDoll();
    /**
     * 送巧克力
     */
    public abstract void giveChocolate();
    /**
     * 送鲜花
     */
    public abstract void giveFlower();

}
