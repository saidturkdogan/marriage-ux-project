package org.saidturkdogan.marriageuxproject.api;



import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class WeddingAttachCommandController {

    private final weddingAttachCommandHandler weddingAttachCommandHandler;

    @PostMapping
    public void createWeddingAttach(@RequestBody WeddingAttachCommand weddingAttachCommand) {
        weddingAttachCommandHandler.handle(weddingAttachCommand);
    }



}
