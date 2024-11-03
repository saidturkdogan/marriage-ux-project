package org.saidturkdogan.marriageuxproject.service.command;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.WeddingAttachCreateCommand;
import org.saidturkdogan.marriageuxproject.model.Gift;
import org.saidturkdogan.marriageuxproject.model.Wedding;
import org.saidturkdogan.marriageuxproject.service.query.GiftQueryHandler;
import org.saidturkdogan.marriageuxproject.service.query.WeddingQueryHandler;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class WeddingAttachCommandHandler {


    private final WeddingQueryHandler weddingQueryHandler;
    private final GiftQueryHandler giftQueryHandler;


    @Transactional
    public void createWeddingAttach(WeddingAttachCreateCommand weddingAttachCommand) {
        UUID weddingId = weddingAttachCommand.weddingId();
        UUID guestId = weddingAttachCommand.guestId();
        UUID giftId = weddingAttachCommand.giftId();
        BigDecimal giftAmount = weddingAttachCommand.giftAmount();

       Wedding wedding = weddingQueryHandler.getWeddingById(weddingId).orElseThrow(() -> {throw new RuntimeException("Wedding not found");});

       wedding.getWeddingGuests()
               .stream()
               .filter(weddingGuest -> weddingGuest.getGuest().getId().equals(guestId))
               .findFirst()
               .ifPresent(weddingGuest -> {
                  Gift gift = giftQueryHandler.get(giftId).orElseThrow(() -> {throw new RuntimeException("Gift not found");});
                  weddingGuest.setGift(gift);
                  weddingGuest.setAmount(giftAmount);
               });
    }

}
