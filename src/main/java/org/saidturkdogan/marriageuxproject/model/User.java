package org.saidturkdogan.marriageuxproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder


public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;
    private String surname;
    private String email;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private List<Wedding> weddings;

}