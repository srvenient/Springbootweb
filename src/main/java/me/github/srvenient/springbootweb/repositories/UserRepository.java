package me.github.srvenient.springbootweb.repositories;

import me.github.srvenient.springbootweb.entity.User;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements Repository<User> {

    private final List<User> users;

    public UserRepository() {
        this.users = new ArrayList<>();
    }

    @Override
    public @Nullable User get(int id) {
        return this.users.get(id);
    }

    @Override
    public @Nullable List<User> getAll() {
        return this.users;
    }

    @Override
    public void save(@NotNull User user) {
        this.users.add(user);
    }

    @Override
    public void update(User user, String[] params) {

    }

    @Override
    public void delete(@NotNull User user) {
        this.users.remove(user);
    }
}
