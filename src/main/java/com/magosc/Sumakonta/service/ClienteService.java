package com.magosc.Sumakonta.service;

import com.magosc.Sumakonta.dto.ClienteRequest;
import com.magosc.Sumakonta.model.Cliente;
import com.magosc.Sumakonta.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }

    public Optional<Cliente> findById(Long id){
        return clienteRepository.findById(id);
    }

    @Transactional
    public Cliente crearCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void deleteById(Long id){
        clienteRepository.deleteById(id);
    }
}
