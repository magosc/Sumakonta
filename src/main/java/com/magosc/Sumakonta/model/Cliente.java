package com.magosc.Sumakonta.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCliente;

    private String nombre;

    private String ruc;

    private String direccion;

    private LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime lastLogin;
    private String token;
    private boolean isActive;
}
