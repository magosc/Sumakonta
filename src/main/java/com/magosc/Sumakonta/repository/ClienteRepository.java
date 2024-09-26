package com.magosc.Sumakonta.repository;

import com.magosc.Sumakonta.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
