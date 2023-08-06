package example;

/**
 * @author 陈柏宇
 * 工作类
 */

public class Work {
    private State current;
    private double hour;
    private boolean finish = false;

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public Work()
    {
        current = new ForenoonState();  //初始状态
    }

    public void setCurrent(State state)
    {
        current = state;
    }

    public void wirteProgram()
    {
        current.wirteProgram(this);
    }
}
