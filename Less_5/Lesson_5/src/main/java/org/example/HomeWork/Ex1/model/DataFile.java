package org.example.HomeWork.Ex1.model;

import java.util.ArrayList;
import java.util.List;

public class DataFile implements Data {
    private UserMap mapper;
    private FileProcess fileOperation;

    public DataFile(FileProcess fileProcess) {
        this(fileProcess, new UserMap());
    }

    public DataFile(FileProcess fileProcess, UserMap userMap) {
        this.fileOperation = fileProcess;
        this.mapper = userMap;
    }

    public void deleteUser(User user) {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }

        int findIndex = -1;

        for (int i = 0; i < users.size(); i++) {
            User currentUser = users.get(i);
            if (user.getId().equals(currentUser.getId())) {
                findIndex = i;
                break;
            }
        }

        if (findIndex > -1) {
            lines.remove(findIndex);
        }

        fileOperation.saveAllLines(lines);

    }

    @Override
    public List<User> getAllUsers() {
        List<String> lines = fileOperation.readAllLines();
        List<User> users = new ArrayList<>();
        for (String line : lines) {
            users.add(mapper.map(line));
        }
        return users;
    }

    @Override
    public void UpdateUser(User user, Chapter field, String param) {
        if (field == Chapter.FIO) {
            user.setLastName(param);
        } else if (field == Chapter.NAME) {
            user.setFirstName(param);
        } else if (field == Chapter.TELEPHONE) {
            user.setPhone(param);
        }
        saveUser(user);
    }

    private void saveUser(User user) {
        List<String> lines = new ArrayList<>();
        List<User> users = getAllUsers();
        for (User item : users) {
            if (user.getId().equals(item.getId())) {
                lines.add(mapper.map(user));
            } else {
                lines.add(mapper.map(item));
            }
        }
        fileOperation.saveAllLines(lines);
    }

    @Override
    public String CreateUser(User user) {

        List<User> users = getAllUsers();
        int max = 0;
        for (User item : users) {
            int id = Integer.parseInt(item.getId());
            if (max < id) {
                max = id;
            }
        }
        int newId = max + 1;
        String id = String.format("%d", newId);
        user.setId(id);
        users.add(user);
        List<String> lines = new ArrayList<>();
        for (User item : users) {
            lines.add(mapper.map(item));
        }
        fileOperation.saveAllLines(lines);
        return id;
    }
}