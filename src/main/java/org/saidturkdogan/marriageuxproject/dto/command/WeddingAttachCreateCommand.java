package org.saidturkdogan.marriageuxproject.dto.command;

import java.math.BigDecimal;

public record WeddingAttachCreateCommand(
        Long weddingId,
        Long guestId,
        Long giftId,
        BigDecimal giftAmount
) {
}
