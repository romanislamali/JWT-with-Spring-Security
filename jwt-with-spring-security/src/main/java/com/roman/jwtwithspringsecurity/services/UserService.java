package com.roman.jwtwithspringsecurity.services;

import com.roman.jwtwithspringsecurity.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Roman Islam", "roman@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Tajnur Rahman", "tajnur@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Ehsan habib", "ehsan@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Seikh Sajib", "sajib@gmail.com"));
    }

    public List<User> getUsers(){
        return store;
    }
}
