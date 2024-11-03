package org.saidturkdogan.marriageuxproject.service.command;


import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.GiftCreateCommand;
import org.saidturkdogan.marriageuxproject.repository.GiftRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GiftCommandHandler {

    private final GiftRepository giftRepository;

    public void createGift(GiftCreateCommand giftCreateCommand){
        giftRepository.save(giftCreateCommand.toGift());
    }


}
