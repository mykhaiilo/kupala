package com.kypala.services;

import com.kypala.domain.User;

import java.time.LocalDate;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserService {

    List<User> listOfUsers = new LinkedList<>();

    public void addUser(User user) {
        listOfUsers.add(user);
    }

    public void updateUser(User user) {
        listOfUsers.remove(user);
        listOfUsers.add(user);
    }

    public User deleteUser(User user) {
        listOfUsers.remove(user);
        return user;
    }

    public boolean existsUser(User user) {
        return listOfUsers.contains(user);
    }

    public User getUser(User user) {
        List<User> foundedUser = listOfUsers.stream()
                .filter(localUser -> localUser.getId().equals(user.getId()))
                .collect(Collectors.toList());
        return foundedUser.iterator().next();
    }

    public void playUserFemale(User user) {

        Iterator<User> numbersIterator = listOfUsers.iterator();
        List<User> femaleUser = new ArrayList<>();
        List<User> femaleUserId = new ArrayList<>();
        Iterator<User> numbersIteratorFemale = femaleUserId.iterator();
        while (numbersIterator.hasNext()) {
            User userII = numbersIterator.next();
            if (userII.getUserSex().equals("female")) {
                femaleUser.add(userII);
            }

        }
        while (numbersIteratorFemale.hasNext()) {
            Iterator<Long> ids = user.getWatchedUsers().iterator();
            while (ids.hasNext()) {
                User userIII = numbersIteratorFemale.next();
                if (userIII.getId().equals(ids.next())) {
                    femaleUserId.add(userIII);
                }
            }
        }
        Collections.sort(femaleUserId, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getUserDateOfCreation().compareTo(o2.getUserDateOfCreation());
            }
        });
        System.out.println(femaleUserId.toArray());
    }

    public void playUserMale(User user) {

        Iterator<User> numbersIterator = listOfUsers.iterator();
        List<User> maleUser = new ArrayList<>();
        List<User> maleUserId = new ArrayList<>();
        Iterator<User> numbersIteratorMale = maleUserId.iterator();
        while (numbersIterator.hasNext()) {
            User userII = numbersIterator.next();
            if (userII.getUserSex().equals("male")) {
                maleUser.add(userII);
            }

        }
        while (numbersIteratorMale.hasNext()) {
            Iterator<Long> idss = user.getWatchedUsers().iterator();
            while (idss.hasNext()) {
                User userIII = numbersIteratorMale.next();
                if (userIII.getId().equals(idss.next())) {
                    maleUserId.add(userIII);
                }
            }
        }
        Collections.sort(maleUserId, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getUserDateOfCreation().compareTo(o2.getUserDateOfCreation());
            }
        });
    }


}




