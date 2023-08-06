package example;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory wf = new WebsiteFactory();

        Website wx = wf.getWebsiteCategory("个人博客");
        wx.Use(new User("小菜"));

        Website wy = wf.getWebsiteCategory("个人博客");
        wy.Use(new User("大鸟"));

        Website wz = wf.getWebsiteCategory("个人博客");
        wz.Use(new User("娇娇"));

        Website f1 = wf.getWebsiteCategory("产品展示");
        f1.Use(new User("陈bai宇"));

        Website f2 = wf.getWebsiteCategory("产品展示");
        f2.Use(new User("陈bo宇"));

        Website f3 = wf.getWebsiteCategory("产品展示");
        f3.Use(new User("陈柏宇"));

        System.out.println("得到网站分类的总数为：" + wf.getWebsiteCount());
    }
}
