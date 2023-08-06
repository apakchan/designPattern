package example;

public class Success extends Status{
    @Override
    public void manAction(Man man) {
        System.out.println("每个" + this.getClass().getName().substring(this.getClass().getName().indexOf(".") + 1) + man.getClass().getName().substring(man.getClass().getName().indexOf(".") + 1) + "的背后，大多都有一个伟大的女人。");
    }

    @Override
    public void womanAction(Woman woman) {
        System.out.println("每个" + this.getClass().getName().substring(this.getClass().getName().indexOf(".") + 1) + woman.getClass().getName().substring(woman.getClass().getName().indexOf(".") + 1) + "的背后，大多都有一个不成功的男人。");
    }
}
