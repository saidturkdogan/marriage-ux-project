package org.saidturkdogan.marriageuxproject.service.command;

import lombok.RequiredArgsConstructor;
import org.saidturkdogan.marriageuxproject.dto.command.UserCommand;
import org.saidturkdogan.marriageuxproject.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserCommand user){
        userRepository.save(user.toUser());
    }

}
