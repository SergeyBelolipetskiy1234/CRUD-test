package ru.belolipetsckiy.models;

public class User {
    private int id;
    private String name;
    private String surname;

    public User() {

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public User(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


}
