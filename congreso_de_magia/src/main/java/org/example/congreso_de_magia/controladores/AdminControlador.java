package org.example.congreso_de_magia.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminControlador {

    @GetMapping("/admin")
    public String areaAdmin() {
        return "Bienvenido al área de administración.";
    }
}