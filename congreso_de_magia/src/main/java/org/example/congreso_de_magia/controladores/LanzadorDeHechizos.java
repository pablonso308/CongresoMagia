package org.example.congreso_de_magia.controladores;

import org.example.congreso_de_magia.hechizos.Hechizo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LanzadorDeHechizos {

    private final Hechizo hechizoFuego;
    private final Hechizo hechizoHielo;

    @Autowired
    public LanzadorDeHechizos(Hechizo hechizoFuego, Hechizo hechizoHielo) {
        this.hechizoFuego = hechizoFuego;
        this.hechizoHielo = hechizoHielo;
    }

    public void lanzarHechizos() {
        hechizoFuego.lanzar();
        hechizoHielo.lanzar();
    }
}