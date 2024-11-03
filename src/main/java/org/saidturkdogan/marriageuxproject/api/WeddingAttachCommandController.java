package org.saidturkdogan.marriageuxproject.api;



import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.WeddingAttachCreateCommand;
import org.saidturkdogan.marriageuxproject.service.command.WeddingAttachCommandHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user/wedding-attach")
@RequiredArgsConstructor
public class WeddingAttachCommandController {

    private final WeddingAttachCommandHandler weddingAttachCommandHandler;

    @PostMapping
    public void createWeddingAttach(@RequestBody WeddingAttachCreateCommand weddingAttachCreateCommand) {
        weddingAttachCommandHandler.createWeddingAttach(weddingAttachCreateCommand);
    }



}
