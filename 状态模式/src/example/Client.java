package example;

public class Client {
    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.wirteProgram();
        work.setHour(10);
        work.wirteProgram();
        work.setHour(12);
        work.wirteProgram();
        work.setHour(13);
        work.wirteProgram();
        work.setHour(14);
        work.wirteProgram();
        work.setHour(17);


        //work.setFinish(true);
        work.setFinish(false);

        work.wirteProgram();
        work.setHour(19);
        work.wirteProgram();
        work.setHour(22);
        work.wirteProgram();
    }
}
