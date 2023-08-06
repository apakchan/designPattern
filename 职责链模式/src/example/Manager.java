package example;

public abstract class Manager {
    protected String name;
    //上级
    protected Manager superior;

    public Manager(String name){
        this.name = name;
    }

    public void setSuperior(Manager superior) {
        this.superior = superior;
    }

    public abstract void requestApplications(Request request);
}
