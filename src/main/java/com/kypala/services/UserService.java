package com.kypala.services;

import com.kypala.domain.User;

import java.util.*;
import java.util.stream.Collectors;

public class UserService {

    LinkedHashSet<User> listOfUsers = new LinkedHashSet<>();

    public void addUser(User user) {
        listOfUsers.add(user);
    }

    public void updateUser(User user) {
        listOfUsers.remove(user);
        listOfUsers.add(user);
    }

    public void deleteUser(User user) {
        listOfUsers.remove(user);
    }

    public User getUser(User user) {
        List<User> foundedUser = listOfUsers.stream()
                .filter(localUser -> localUser.getId().equals(user.getId()))
                .collect(Collectors.toList());
        return foundedUser.iterator().next();
    }
}

