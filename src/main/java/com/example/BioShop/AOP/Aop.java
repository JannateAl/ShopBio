package com.example.BioShop.AOP;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Aop {

    private static final Logger logger = LogManager.getLogger("Aop logger");

    @Before("execution(* * ..controllers.*.getProduit*(..))")
    public void before(@NotNull JoinPoint joinPoint){
        logger.info("Before method:" + joinPoint.getSignature());
    }
}
