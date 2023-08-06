package example;

public class Failed extends Status{
    @Override
    public void manAction(Man man) {
        System.out.println(man.getClass().getName().substring(man.getClass().getName().indexOf(".") + 1) + this.getClass().getName().substring(this.getClass().getName().indexOf(".") + 1) + "时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void womanAction(Woman woman) {
        System.out.println(woman.getClass().getName().substring(woman.getClass().getName().indexOf(".") + 1) + this.getClass().getName().substring(this.getClass().getName().indexOf(".") + 1) + "时，眼泪汪汪，谁也劝不动。");
    }
}
