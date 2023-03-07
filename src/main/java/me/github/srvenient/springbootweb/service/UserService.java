package me.github.srvenient.springbootweb.service;

import jakarta.annotation.Nonnull;
import me.github.srvenient.springbootweb.entity.User;
import me.github.srvenient.springbootweb.repositories.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class UserService {

    private final UserRepository repository;

    public UserService() {
        this.repository = new UserRepository();
    }

    public @Nullable User getUser(int id) {
        User user = this.repository.get(id);

        if (user == null) {
            return new User("non-existing user", "no-email", "no-paassword");
        }

        return user;
    }

    public List<User> getUsers() {
        return repository.getAll();
    }

    public void addUser(@NotNull User user) {
        repository.save(user);
    }

}
