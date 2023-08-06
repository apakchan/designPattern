package reinforce;

import example.*;

/**
 * @author 陈柏宇
 * 抽象工厂接口
 */

public interface IFactory {
    IUser createUser();
    IDepartment createDepartment();
}

