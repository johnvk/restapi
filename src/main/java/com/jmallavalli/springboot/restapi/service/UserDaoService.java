package com.jmallavalli.springboot.restapi.service;

import com.jmallavalli.springboot.restapi.model.User;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static final List<User> users = new ArrayList<>();

    private static int index = 0;

    static {
        users.add(new User(++index, "Andrew", LocalDate.now().minusYears(40)));
        users.add(new User(++index, "Bindu", LocalDate.now().minusYears(20)));
        users.add(new User(++index, "Celia", LocalDate.now().minusYears(25)));
        users.add(new User(++index, "Daniel", LocalDate.now().minusYears(35)));
    }

    public List<User> findAll() {
        return users;
    }

    public User find(Integer id) {
        Predicate<User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public void saveUser(User newUser) {
        newUser.setId(++index);
        users.add(newUser);
    }

    public void delete(int id) {
        Predicate<User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
