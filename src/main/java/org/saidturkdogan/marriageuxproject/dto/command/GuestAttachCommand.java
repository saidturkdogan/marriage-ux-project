package org.saidturkdogan.marriageuxproject.dto.command;

import java.util.UUID;

public record GuestAttachCommand(
        UUID guestId
) {
}
