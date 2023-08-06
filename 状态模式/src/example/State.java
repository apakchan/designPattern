package example;

/**
 * @author 陈柏宇
 * 状态类
 */

public abstract class State {
    abstract void wirteProgram(Work w);
}
/*
上午工作状态
 */
class ForenoonState extends State{
    @Override
    void wirteProgram(Work w) {
        if(w.getHour() < 12) {
            System.out.println("当前时间：" + w.getHour() + "，精力充沛！");
        }
        else {
            w.setCurrent(new NoonState());
            w.wirteProgram();
        }
    }
}
/*
中午工作状态
 */
class NoonState extends State{
    @Override
    void wirteProgram(Work w) {
        if(w.getHour() < 13) {
            System.out.println("当前时间：" + w.getHour() + "，饿了，去吃饭");
        }
        else {
            w.setCurrent(new AfternoonState());
            w.wirteProgram();
        }
    }
}
/*
下午工作状态
 */
class AfternoonState extends State{
    @Override
    void wirteProgram(Work w) {
        if(w.getHour() < 17) {
            System.out.println("当前时间：" + w.getHour() + "，下午状态不错，继续努力！");
        }
        else {
            w.setCurrent(new EveningState());
            w.wirteProgram();
        }
    }
}
/*
傍晚工作状态
 */
class EveningState extends State{
    @Override
    void wirteProgram(Work w) {
        if (w.isFinish())
        {
            w.setCurrent(new RestState());
            w.wirteProgram();
        }
        else
        {
            if(w.getHour()<21)
            {
                System.out.println("当前时间：" + w.getHour() + "，加班哇，好困好困！");
            }
            else
            {
                w.setCurrent(new SleepingState());
                w.wirteProgram();
            }
        }
    }
}
/*
睡眠工作状态
 */
class SleepingState extends State
{
    @Override
    void wirteProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "，不行了，睡着了。");
    }
}
/*
下班休息状态
 */
class RestState extends State
{
    @Override
    void wirteProgram(Work w) {
        System.out.println("当前时间：" + w.getHour() + "，下班回家了。");
    }
}