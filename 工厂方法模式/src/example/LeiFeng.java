package example;

/**
 * @author 陈柏宇
 * 雷锋类  我们都要学习雷锋的精神
 */

public class LeiFeng {
    public void sweep()
    {
        System.out.println("扫地");
    }
    public void Wash()
    {
        System.out.println("洗衣服");
    }
    public void BuyRice()
    {
        System.out.println("买衣服");
    }
}

class Undergraduate extends LeiFeng
{
    /**
     * 学雷锋的大学生
     */
}

class Volunteer extends LeiFeng
{
    /**
     * 社区志愿者
     */
}

