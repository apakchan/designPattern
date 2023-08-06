package reinforce;

import example.User;

public class AccessUser implements IUser {
    @Override
    public void insert(User user) {
        System.out.println("Access插入一条User数据");
    }

    @Override
    public User getUserById(int id) {
        System.out.println("Access根据id查询一条用户数据");
        return null;
    }
}
