package org.saidturkdogan.marriageuxproject.dto.command;

import org.saidturkdogan.marriageuxproject.model.Guest;

public record GuestCreateCommand(
        String name,
        String surname
) {

    public Guest toModel() {
        return Guest.builder()
                .name(name)
                .surname(surname)
                .build();
    }
}
