package com.magosc.Sumakonta.service;

import com.magosc.Sumakonta.dto.FacturaRequest;
import com.magosc.Sumakonta.model.Factura;
import com.magosc.Sumakonta.repository.FacturaRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Transactional
    public Factura crearFactura(FacturaRequest facturaRequest){

        Factura factura = new Factura();
        factura.setMonto(factura.getMonto());
        factura.setFecha(LocalDateTime.now());
        return facturaRepository.save(factura);
    }

    public List<Factura> listarFacturas(){
        return facturaRepository.findAll();
    }
}
