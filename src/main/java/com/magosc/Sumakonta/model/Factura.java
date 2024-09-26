package com.magosc.Sumakonta.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idFactura;

    private Double monto;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    Cliente cliente;
}
