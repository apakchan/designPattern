package reinforce;

import example.User;

public interface IUser {
    void insert(User user);
    User getUserById(int id);
}

