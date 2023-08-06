package example;

public class ConcreteWebsite extends Website{

    private String name;

    public ConcreteWebsite(String name){
        this.name = name;
    }

    @Override
    public void Use(User user) {
        System.out.println("网站分类" + this.name + ",用户:" + user.getName());
    }
}
