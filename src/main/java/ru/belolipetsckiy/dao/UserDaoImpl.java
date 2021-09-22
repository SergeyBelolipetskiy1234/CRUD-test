package ru.belolipetsckiy.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.belolipetsckiy.models.Person;
import ru.belolipetsckiy.models.User;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao{
        private static int PEOPLE_COUNT;
        private List<User> users;

  {
        users = new ArrayList<>();

        users.add(new User(++PEOPLE_COUNT, "Tom", "Abrikosov", 20, "mail@mail.ru"));
        users.add(new User(++PEOPLE_COUNT, "Jerry", "Alaverdov",20, "mail2@mail.ru"));
        users.add(new User(++PEOPLE_COUNT, "Dug", "Donald",20, "mail3@mail.ru"));
        users.add(new User(++PEOPLE_COUNT, "Boris", "Britva",20, "mail4@mail.ru"));
    }
    public List<User> index() {
        return users;
    }

    public User show(int id) {
        return users.stream().filter(user-> user.getId() == id).findAny().orElse(null);
    }

    public void save(User user) {
        user.setId(++PEOPLE_COUNT);
        users.add(user);
    }

    public void update(int id, User updateUser) {
        User userToBeUpdated= show(id);
        userToBeUpdated.setName(updateUser.getName());
        userToBeUpdated.setSurname(updateUser.getSurname());
        userToBeUpdated.setAge(updateUser.getAge());
        userToBeUpdated.setEmail(updateUser.getEmail());
    }

    public void delete(int id) {
        users.removeIf(u -> u.getId() == id);
    }
}
