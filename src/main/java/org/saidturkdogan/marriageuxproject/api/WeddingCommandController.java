package org.saidturkdogan.marriageuxproject.api;


import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.WeddingCreateCommand;
import org.saidturkdogan.marriageuxproject.model.Wedding;
import org.saidturkdogan.marriageuxproject.service.command.WeddingCommandHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/wedding")
@RequiredArgsConstructor
public class WeddingCommandController {

    private final WeddingCommandHandler weddingCommandHandler;

    @PostMapping
    public void createWedding(@RequestBody WeddingCreateCommand weddingCreateCommand){
        weddingCommandHandler.createWedding(weddingCreateCommand);
    }

}
