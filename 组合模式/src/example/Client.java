package example;

/**
 * @author 陈柏宇
 * 模拟一下南林本部和淮安校区的功能实现
 */

public class Client {
    public static void main(String[] args) {
        Academy NJFU = new University("南京林业大学本部");
        Academy NjfuHuai = new University("南京林业大学淮安校区");
        NJFU.add(NjfuHuai);

        Academy ComputerScience = new College("本部计算机学院");
        ComputerScience.add(new Major("本部软件工程专业"));
        ComputerScience.add(new Major("本部计算机科学专业"));

        Academy Mechanics = new College("本部机械电子工程学院");
        Mechanics.add(new Major("本部机电专业"));
        Mechanics.add(new Major("本部机械设计制造专业"));

        NJFU.add(ComputerScience);
        NJFU.add(Mechanics);

        Academy ComputerScienceHuai = new College("淮安校区计算机学院");
        ComputerScienceHuai.add(new Major("淮安校区软件工程专业"));
        ComputerScienceHuai.add(new Major("淮安校区计算机科学专业"));

        Academy MechanicsHuai = new College("淮安校区机械电子工程学院");
        MechanicsHuai.add(new Major("淮安校区机电专业"));
        MechanicsHuai.add(new Major("淮安校区机械设计制造专业"));

        NjfuHuai.add(ComputerScienceHuai);
        NjfuHuai.add(MechanicsHuai);

        NJFU.display(1);

        System.out.println("***********************职责********************");
        NJFU.duty();
    }
}
