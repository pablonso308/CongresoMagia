package org.example.congreso_de_magia.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicoControlador {

    @GetMapping("/")
    public String bienvenida() {
        return "¡Bienvenido al sistema!";
    }
}