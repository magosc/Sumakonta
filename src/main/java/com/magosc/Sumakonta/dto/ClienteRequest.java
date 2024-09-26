package com.magosc.Sumakonta.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ClienteRequest {

    private String nombre;
    private String ruc;
    private String direccion;
    private LocalDateTime created;
    private LocalDateTime updated;
    private LocalDateTime lastLogin;
    private String token;
    private boolean isActive;
}
