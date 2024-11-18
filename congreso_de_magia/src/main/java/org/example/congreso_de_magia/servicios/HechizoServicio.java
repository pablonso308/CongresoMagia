package org.example.congreso_de_magia.servicios;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class HechizoServicio {

    @PreAuthorize("hasRole('ADMIN')")
    public String lanzarHechizoAvanzado(String hechizo) {
        return "Lanzando hechizo avanzado: " + hechizo;
    }

    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String lanzarHechizoBasico(String hechizo) {
        return "Lanzando hechizo básico: " + hechizo;
    }

    public String lanzarHechizo(String hechizo) {
        return "Lanzando hechizo: " + hechizo;
    }
}