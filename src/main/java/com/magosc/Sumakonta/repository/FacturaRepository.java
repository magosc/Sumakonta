package com.magosc.Sumakonta.repository;

import com.magosc.Sumakonta.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}
