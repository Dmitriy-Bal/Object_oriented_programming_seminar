package org.example.HomeWork.Ex1.model;

import java.util.List;

public interface Data {
    List<User> getAllUsers();

    String CreateUser(User user);

    void UpdateUser(User user, Chapter field, String param);

    void deleteUser(User user);
}