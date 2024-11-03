package org.saidturkdogan.marriageuxproject.service.query;


import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.model.Wedding;
import org.saidturkdogan.marriageuxproject.repository.WeddingRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class WeddingQueryHandler {
    private final WeddingRepository weddingRepository;


    @Cacheable(key = "#weddingId", value = "wedding")
    public Optional <Wedding> getWeddingById(UUID weddingId) {
        return weddingRepository.findById(weddingId);
    }
}
