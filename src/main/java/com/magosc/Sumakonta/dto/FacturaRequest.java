package com.magosc.Sumakonta.dto;

import com.magosc.Sumakonta.model.Cliente;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class FacturaRequest {

    private Double monto;
    private LocalDateTime fecha;
    private Cliente cliente;
}
