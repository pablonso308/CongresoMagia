package org.example.congreso_de_magia.servicios;

import org.springframework.stereotype.Service;

@Service
public class HechizoServicio {

    public void lanzarHechizo(String hechizo) {
        System.out.println("Lanzando hechizo: " + hechizo);
    }
}