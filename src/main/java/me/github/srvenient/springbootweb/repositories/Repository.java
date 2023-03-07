package me.github.srvenient.springbootweb.repositories;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface Repository<T> {

    @Nullable T get(int id);

    @Nullable List<T> getAll();

    void save(@NotNull T t);

    void update(T t, String[] params);

    void delete(@NotNull T t);

}
