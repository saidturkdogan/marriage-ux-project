package org.saidturkdogan.marriageuxproject.service.command;

import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.GuestAttachCommand;
import org.saidturkdogan.marriageuxproject.dto.command.WeddingCreateCommand;
import org.saidturkdogan.marriageuxproject.model.Wedding;
import org.saidturkdogan.marriageuxproject.model.WeddingGuest;
import org.saidturkdogan.marriageuxproject.repository.GuestRepository;
import org.saidturkdogan.marriageuxproject.repository.WeddingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Service
@RequiredArgsConstructor
public class WeddingCommandHandler {
    private final WeddingRepository weddingRepository;
    private final GuestRepository guestRepository;

    public void createWedding(WeddingCreateCommand command) {
        LocalDateTime weddingDate = command.weddingDate();
        String name = command.name();
        List<WeddingGuest> weddingGuests = new ArrayList<>();
        List<GuestAttachCommand> guestAttachCommands = command.existingGuests();

        /*for (GuestAttachCommand guestAttachCommand: guestAttachCommands) {
            UUID guestId = guestAttachCommand.guestId();
            guestRepository.findById(guestId).ifPresent(guest -> {
                weddingGuests.add(WeddingGuest.builder().guest(guest).build());
            });
        }*/

        guestAttachCommands
                .forEach(guestAttachCommand -> {
                    UUID guestId = guestAttachCommand.guestId();
                    guestRepository.findById(guestId).ifPresent(guest -> weddingGuests.add(WeddingGuest.builder().guest(guest).build()));
                        });


        weddingRepository.save(Wedding.builder()
                .name(name)
                .weddingDate(weddingDate)
                .weddingGuests(weddingGuests)
                .build());

    }

}
