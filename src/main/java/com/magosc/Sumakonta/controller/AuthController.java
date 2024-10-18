package com.magosc.Sumakonta.controller;

import com.magosc.Sumakonta.model.Usuario;
import com.magosc.Sumakonta.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String mostrarFormularioLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String mostrarFormularioClientes(){
        return "redirect:/api/clientes";
    }

    @GetMapping("/register")
    public String mostrarFormularioRegistro(Model model){
        model.addAttribute("usuario", new Usuario());
        return "register";
    }

    @PostMapping("/register")
    public String registrarUsuario(@ModelAttribute Usuario usuario){
        usuarioService.crearUsuario(usuario);
        return "redirect:/login";
    }

    @GetMapping("/usuarios")
    public String listarUsuarios(Model model){
        model.addAttribute("usuarios", usuarioService.listarUsuarios());
        return "lista_usuarios";
    }
}
