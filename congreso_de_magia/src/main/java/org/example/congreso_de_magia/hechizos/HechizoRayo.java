package org.example.congreso_de_magia.hechizos;

import org.springframework.stereotype.Component;

@Component
public class HechizoRayo implements Hechizo {
    @Override
    public void lanzar() {
        System.out.println("¡Lanzando un hechizo de rayo!");
    }
}