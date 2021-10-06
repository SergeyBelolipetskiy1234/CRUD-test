package ru.belolipetsckiy.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.belolipetsckiy.dao.UserDao;
import ru.belolipetsckiy.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }
    @Transactional
    public List<User> index() {
        return userDao.index();
    }
    @Transactional
    public User show(int id) {
        return userDao.show(id);
    }
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }
    @Transactional
    public void update(int id, User updateUser) {
    userDao.update(id, updateUser);
    }
    @Transactional
    public void delete(int id) {
        userDao.delete(id);
    }
}
