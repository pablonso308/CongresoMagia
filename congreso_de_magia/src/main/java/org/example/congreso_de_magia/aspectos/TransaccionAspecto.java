package org.example.congreso_de_magia.aspectos;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TransaccionAspecto {

    @Around("execution(* org.example.congreso_de_magia.aspectos.*.*(..))")
    public Object gestionarTransaccion(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Iniciando transacción...");
        Object resultado;
        try {
            resultado = joinPoint.proceed(); // Ejecuta el método
            System.out.println("Transacción completada con éxito.");
        } catch (Exception ex) {
            System.out.println("Error en la transacción. Realizando rollback...");
            throw ex; // Manejo adicional del rollback según sea necesario
        }
        return resultado;
    }
}