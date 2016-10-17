package org.lavrinovich.springinaction.SpringExamples.Other;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Mix74rus on 20.09.16.
 */
@Component
@Aspect
public class Audience {

    @Pointcut("execution(* org.lavrinovich.springinaction.SpringExamples.Performers.Performer.perform(..))")
    public void performMethod() {}

    @Around("performMethod()")
    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Садятся");
            System.out.println("Выключают телефоны");
            long start = System.currentTimeMillis();

            Object result = joinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("Апладируют");
            System.out.println("Время = " + (end - start) + "мс");
        } catch (Throwable throwable) {
            System.out.println("Требуют деньги назад");
        }
    }

}
