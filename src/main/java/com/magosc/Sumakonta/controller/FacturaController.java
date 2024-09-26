package com.magosc.Sumakonta.controller;

import com.magosc.Sumakonta.model.Factura;
import com.magosc.Sumakonta.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/listar")
    public List<Factura> listarFacturas(){
        List<Factura> listaFacturas = facturaService.listarFacturas();
        return listaFacturas;
    }
}
