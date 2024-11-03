package org.saidturkdogan.marriageuxproject.repository;

import org.saidturkdogan.marriageuxproject.model.Wedding;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface WeddingRepository extends JpaRepository<Wedding, UUID> {
}
