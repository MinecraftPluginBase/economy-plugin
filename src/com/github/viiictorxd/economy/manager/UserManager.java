package com.github.viiictorxd.economy.manager;

import com.github.viiictorxd.economy.entity.User;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserManager {

    private final Map<UUID, User> users;

    public UserManager() {
        this.users = new HashMap<>();
    }

    public Map<UUID, User> getUsers() {
        return users;
    }

    public Collection<User> getAll() {
        return users.values();
    }

    public User getById(UUID uniqueId) {
        return users.get(uniqueId);
    }
}
