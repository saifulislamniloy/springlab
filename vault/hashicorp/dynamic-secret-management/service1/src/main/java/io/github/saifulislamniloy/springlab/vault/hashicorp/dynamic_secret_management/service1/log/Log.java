package io.github.saifulislamniloy.springlab.vault.hashicorp.dynamic_secret_management.service1.log;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Instant;

@Data
@Table(name = "logs")
@Entity
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String message;
    private Instant createdAt;
}
