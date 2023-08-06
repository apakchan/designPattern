package example;

/**
 * @author 陈柏宇
 * 抽象工厂接口
 */

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}

class SqlServerFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();
    }
}

class AccessFactory implements IFactory{
    @Override
    public IUser createUser() {
        return new AccessUser();
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();
    }
}

