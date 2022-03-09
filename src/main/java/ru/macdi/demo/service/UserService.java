package ru.macdi.demo.service;

import ru.macdi.demo.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();
    void addUser(User user);
    void updateUser(User user);
    User getUserById(Long id);
    void deleteUser(Long id);
}
