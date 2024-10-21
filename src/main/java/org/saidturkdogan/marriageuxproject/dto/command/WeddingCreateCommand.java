package org.saidturkdogan.marriageuxproject.dto.command;

import java.time.LocalDateTime;
import java.util.List;

public record WeddingCreateCommand(
        String name,
        LocalDateTime weddingDate,
        List<GuestAttachCommand> existingGuests

) {
}
