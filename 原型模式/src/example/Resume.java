package example;



/**
 * @author 陈柏宇
 * 简历类，要求可以实现简历的复制
 */

public class Resume implements Cloneable{

    private String name;
    private String sex;
    private int age;

    private WorkExperience workExperience;   //新增一个对象成员

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience)
    {
        try {
            this.workExperience = (WorkExperience) workExperience.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    //设置个人信息
    public void setPersonalInfo(String sex,int age)
    {
        this.sex = sex;
        this.age = age;
    }

    //设置工作经历
    public void setWorkExperience(String timeArea,String company)
    {
        this.workExperience.setCompany(company);
        this.workExperience.setTimeArea(timeArea);
    }

    //显示
    public void display()
    {
        System.out.println(name + " " + age + " " + sex);
        System.out.println("工作经历 " + this.workExperience.getTimeArea() + " " + this.workExperience.getCompany() );
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Resume obj = new Resume(this.workExperience);  //调用新增的私有构造函数实现深复制
        obj.name = this.name;  //拷贝字段值
        obj.sex = this.sex;
        obj.age = this.age;
        return obj;     //最终返回一个深复制的对象
    }
}

/**
        * @author 陈柏宇
 * 工作经验类 Resume类的成员之一
 */
    class WorkExperience implements Cloneable
    {
        private String timeArea;
        private String company;

        public String getTimeArea() {
            return timeArea;
        }

        public void setTimeArea(String timeArea) {
            this.timeArea = timeArea;
        }

        public String getCompany() {
        return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return (Object) super.clone();
        }
    }