package org.example.congreso_de_magia.aspectos;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    // Intercepta todos los métodos en un paquete específico
    @Before("execution(* org.example.congreso_de_magia..*(..))")
    public void logBeforeMethodExecution() {
        logger.info("Un método se ejecutó en el paquete 'org.example.congreso_de_magia'");
    }
}