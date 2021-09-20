package ru.belolipetsckiy.dao;

import org.springframework.stereotype.Component;
import ru.belolipetsckiy.models.Person;
import ru.belolipetsckiy.models.User;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDao {
    private static int PEOPLE_COUNT;
    private List<User> users;

    {
        users = new ArrayList<>();

        users.add(new User(++PEOPLE_COUNT, "Tom", "Abrikosov"));
        users.add(new User(++PEOPLE_COUNT, "Jerry", "Alaverdov"));
        users.add(new User(++PEOPLE_COUNT, "Dug", "Donald"));
        users.add(new User(++PEOPLE_COUNT, "Boris", "Britva"));
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
    }

    public void delete(int id) {
        users.removeIf(u -> u.getId() == id);
    }
}
