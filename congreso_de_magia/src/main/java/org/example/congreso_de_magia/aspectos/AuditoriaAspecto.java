package org.example.congreso_de_magia.aspectos;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuditoriaAspecto {

    @After("execution(* org.example.congreso_de_magia.aspectos.*.*(..))")
    public void registrarAuditoria() {
        System.out.println("Auditoría: Método ejecutado correctamente.");
        // Lógica adicional: Guardar en logs o base de datos
    }
}