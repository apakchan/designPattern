package example;

public class Client {
    public static void main(String[] args) {
        Manager m1 = new CommonManager("经理");
        Manager m2 = new Majordomo("总监");
        Manager m3 = new GeneralManager("总经理");

        m1.setSuperior(m2);
        m2.setSuperior(m3);

        m1.requestApplications(new Request("请假","A家里有事！",4));
        m1.requestApplications(new Request("请假","B家里有事！",1));
        m1.requestApplications(new Request("加薪","C缺钱!",300));
        m1.requestApplications(new Request("加薪","D缺钱!",700));
        m1.requestApplications(new Request("请假","E家里有事！",7));
    }
}
