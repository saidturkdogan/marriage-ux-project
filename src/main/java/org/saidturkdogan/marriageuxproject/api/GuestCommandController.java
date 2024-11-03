package org.saidturkdogan.marriageuxproject.api;

import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.GuestCreateCommand;
import org.saidturkdogan.marriageuxproject.service.command.GuestCommandHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/guest")
@RequiredArgsConstructor
public class GuestCommandController {

    private final GuestCommandHandler guestCommandHandler;

    @PostMapping
    public void createGuest(@RequestBody GuestCreateCommand guestCreateCommand){
        guestCommandHandler.createGuest(guestCreateCommand);
    }


}
