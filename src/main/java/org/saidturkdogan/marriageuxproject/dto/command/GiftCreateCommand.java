package org.saidturkdogan.marriageuxproject.dto.command;

import org.saidturkdogan.marriageuxproject.model.Gift;
import org.saidturkdogan.marriageuxproject.model.GiftType;

public record GiftCreateCommand(
        String parentName,
        String imageUrl,
        GiftType giftType
) {

    public Gift toGift() {
        return Gift.builder()
                .giftType(giftType)
                .name(parentName)
                .build();
    }


}
