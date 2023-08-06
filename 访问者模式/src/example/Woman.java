package example;

public class Woman extends Person{
    @Override
    public void accept(Status status) {
        status.womanAction(this);
    }
}
