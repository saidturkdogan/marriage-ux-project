package org.saidturkdogan.marriageuxproject.api;


import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.GiftCreateCommand;
import org.saidturkdogan.marriageuxproject.service.command.GiftCommandHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/gift")
@RequiredArgsConstructor
public class GiftCommandController {

    private final GiftCommandHandler giftCommandHandler;

    @PostMapping
    public void createGift(@RequestBody GiftCreateCommand giftCreateCommand) {
        giftCommandHandler.createGift(giftCreateCommand);
    }
}
