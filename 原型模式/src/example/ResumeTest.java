package example;

public class ResumeTest {
    public static void main(String[] args) {

        Resume a = new Resume("小明");
        a.setPersonalInfo("男",30);
        a.setWorkExperience("2018-2020","阿里巴巴");

        Resume b = null;
        try {
            b = (Resume) a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        b.setWorkExperience("2014-2019","字节跳动");

        Resume c = null;
        try {
            c = (Resume) a.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        c.setPersonalInfo("女",35);

        a.display();
        b.display();
        c.display();
    }
}


