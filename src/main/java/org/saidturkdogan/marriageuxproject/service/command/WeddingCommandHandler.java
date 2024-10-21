package org.saidturkdogan.marriageuxproject.service.command;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor

public class WeddingCommandHandler {
    private final WeddingRepository weddingRepository;

}
