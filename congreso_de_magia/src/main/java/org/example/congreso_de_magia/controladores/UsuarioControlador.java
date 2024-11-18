package org.example.congreso_de_magia.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioControlador {

    @GetMapping("/user")
    public String areaUsuario() {
        return "Bienvenido al área de usuarios.";
    }
}