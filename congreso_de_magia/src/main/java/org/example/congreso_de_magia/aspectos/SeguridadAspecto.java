package org.example.congreso_de_magia.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SeguridadAspecto {

    @Before("execution(* org.example.congreso_de_magia.aspectos.*.*(..))")
    public void verificarSeguridad() {
        System.out.println("Verificando permisos de seguridad...");
        // Simulación: validación de usuario autorizado
        boolean autorizado = true; // Cambiar según lógica
        if (!autorizado) {
            throw new SecurityException("Usuario no autorizado para ejecutar esta operación");
        }
    }
}