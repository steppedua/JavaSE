package JunitTestSystem.service;

import JunitTestSystem.dao.UserDao;
import JunitTestSystem.model.User;

public class UserService {
    private final UserDao userDao;

    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }


    public boolean checkUserPresence(User user) throws Exception {
        User u = userDao.getUserByUsername(user.getUsername());

        return u != null;
    }
}
