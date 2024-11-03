package org.saidturkdogan.marriageuxproject.service.query;


import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.model.Gift;
import org.saidturkdogan.marriageuxproject.repository.GiftRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class GiftQueryHandler {

    private final GiftRepository giftRepository;

    @Cacheable(key = "#giftId", value = "gift")
    public Optional<Gift> get(UUID id) {
        return giftRepository.findById(id);
    }

}
