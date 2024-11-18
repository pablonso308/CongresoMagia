
package org.example.congreso_de_magia.config;


import org.example.congreso_de_magia.hechizos.Hechizo;
import org.example.congreso_de_magia.hechizos.HechizoFuego;
import org.example.congreso_de_magia.hechizos.HechizoHielo;
import org.example.congreso_de_magia.hechizos.HechizoRayo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HechizosConfig {

    @Bean
    public Hechizo hechizoFuego() {
        return new HechizoFuego();
    }

    @Bean
    public Hechizo hechizoHielo() {
        return new HechizoHielo();
    }

    @Bean
    public Hechizo hechizoRayo() {
        return new HechizoRayo();
    }
}