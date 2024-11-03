package org.saidturkdogan.marriageuxproject.repository;

import org.saidturkdogan.marriageuxproject.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface GuestRepository extends JpaRepository<Guest, UUID> {

}
