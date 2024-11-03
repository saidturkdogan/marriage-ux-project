package org.saidturkdogan.marriageuxproject.service.command;



import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.GuestCreateCommand;
import org.saidturkdogan.marriageuxproject.repository.GuestRepository;
import org.springframework.stereotype.Service;



@Service
@RequiredArgsConstructor
@Transactional
public class GuestCommandHandler {

    private final GuestRepository guestRepository;

    public void createGuest(GuestCreateCommand guestCreateCommand){
        guestRepository.save(guestCreateCommand.toModel());
    }
}
