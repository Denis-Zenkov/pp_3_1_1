package ru.macdi.demo.repository;

import ru.macdi.demo.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUser();

    void addUser(User user);

    void updateUser(User user);

    User getUserById(int id);

    void deleteUser(int id);
}
