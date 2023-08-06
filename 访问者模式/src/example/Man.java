package example;

public class Man extends Person{
    @Override
    public void accept(Status status) {
        status.manAction(this);
    }
}
