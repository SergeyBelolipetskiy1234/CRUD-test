package ru.belolipetsckiy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.belolipetsckiy.dao.UserDao;
import ru.belolipetsckiy.models.User;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

  /*  private static int PEOPLE_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++PEOPLE_COUNT, "Tom", "Abrikosov", 20, "mail@mail.ru"));
        users.add(new User(++PEOPLE_COUNT, "Jerry", "Alaverdov",20, "mail2@mail.ru"));
        users.add(new User(++PEOPLE_COUNT, "Dug", "Donald",20, "mail3@mail.ru"));
        users.add(new User(++PEOPLE_COUNT, "Boris", "Britva",20, "mail4@mail.ru"));
    } */
    public List<User> index() {
        return userDao.index();
    }

    public User show(int id) {
        return userDao.show(id);
    }

    public void save(User user) {
      /*  user.setId(++PEOPLE_COUNT);
        users.add(user); */
        userDao.save(user);
    }

    public void update(int id, User updateUser) {
    userDao.update(id, updateUser);
    }

    public void delete(int id) {
        userDao.delete(id);
    }
}
