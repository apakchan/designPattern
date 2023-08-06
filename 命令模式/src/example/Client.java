package example;

public class Client {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Meet meet = new Meet(cooker);
        Mutton mutton = new Mutton(cooker);

        Waiter waiter = new Waiter();
        waiter.addDish(meet);
        for(int i = 0;i < 10;i++){
            waiter.addDish(mutton);
        }

        for (int i = 0;i < 4;i++){
            waiter.cancerDish(mutton);
        }

        waiter.notifyAllDo();
    }
}
