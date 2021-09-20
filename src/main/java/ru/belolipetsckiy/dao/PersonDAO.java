package ru.belolipetsckiy.dao;

import org.springframework.stereotype.Component;
import ru.belolipetsckiy.models.Person;

import java.util.ArrayList;
import java.util.List;


@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();

        people.add(new Person(++PEOPLE_COUNT, "Tom", 13, "abra@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Bob", 20, "abra2@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Mike", 17, "abra3@mail.ru"));
        people.add(new Person(++PEOPLE_COUNT, "Katy", 13, "abra4@mail.ru"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatePerson) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(updatePerson.getName());
        personToBeUpdated.setAge(updatePerson.getAge());
        personToBeUpdated.setEmail(updatePerson.getEmail());

    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}