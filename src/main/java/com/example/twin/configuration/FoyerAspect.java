package com.example.twin.configuration;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class FoyerAspect {
    @Before("execution(* com.example.twin.Services.*.*(..))")
    void aop(JoinPoint joinPoint){

        log.info("Avant l'execution de la methode "+joinPoint.getSignature().getName(),"situe dans le package"+joinPoint.getSignature().getClass().getPackageName());
    }
}
