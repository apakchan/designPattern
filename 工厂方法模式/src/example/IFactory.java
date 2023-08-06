package example;

/**
 * @author 陈柏宇
 * 雷锋工厂
 * 生产大学生实例和社区志愿者实例
 */

public interface IFactory {
    public abstract LeiFeng createLeiFeng();
}

class UndergraduateFactory implements IFactory{
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}

class VolunteerFactory implements IFactory
{
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
