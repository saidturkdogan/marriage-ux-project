package org.saidturkdogan.marriageuxproject.dto.command;

import org.saidturkdogan.marriageuxproject.model.User;

public record UserCommand(
        String name,
        String surname

) {
    public User toUser() {
        return User.builder()
                .name(name)
                .surname(surname)
                .build();
    }
}
