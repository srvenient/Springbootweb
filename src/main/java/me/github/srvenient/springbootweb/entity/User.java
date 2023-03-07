package me.github.srvenient.springbootweb.entity;

import org.jetbrains.annotations.NotNull;

public record User(
        @NotNull String username, @NotNull String gmail, @NotNull String password
) {
}
