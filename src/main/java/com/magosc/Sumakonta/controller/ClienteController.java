package com.magosc.Sumakonta.controller;

import com.magosc.Sumakonta.model.Cliente;
import com.magosc.Sumakonta.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public String getAllClientes(Model model){
        List<Cliente> clientes = clienteService.findAll();
        model.addAttribute("clientes", clientes);
        return "clientes";
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getClienteById(@PathVariable Long id){
        return clienteService.findById(id);
    }

    @GetMapping("/nuevo")
    public String nuevoClienteForm(Model model){
        model.addAttribute("cliente", new Cliente());
        return "cliente_form";
    }

    @PostMapping("/guardar")
    public String guardarCliente(@ModelAttribute Cliente cliente){
        clienteService.crearCliente(cliente);
        return "redirect:/api/clientes";
    }

    @PutMapping("/editar/{id}")
    public String actualizarCliente(@PathVariable Long id, Model model){
        Cliente cliente = clienteService.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid client id: "+id));
        model.addAttribute("cliente", cliente);
        return "cliente_form";
    }

    @DeleteMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable Long id){
        clienteService.deleteById(id);
        return "redirect:/api/clientes";
    }
}
