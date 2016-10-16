package org.lavrinovich.springinaction.package1.Other;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by Mix74rus on 20.09.16.
 */

public class Audience {

    public void takeSeats(){
        System.out.println("Садятся");
    }

    public void turnOffCellPhones() {
        System.out.println("Выключают телефоны");
    }

    public void applaud() {
        System.out.println("Апладируют");
    }

    public void demandRefund() {
        System.out.println("Требуют деньги назад");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("Садятся");
            System.out.println("Выключают телефоны");
            long start = System.currentTimeMillis();

            joinPoint.proceed();

            long end = System.currentTimeMillis();
            System.out.println("Апладируют");
            System.out.println("Время = " + (end - start) + "мс");
        } catch (Throwable throwable) {
            System.out.println("Требуют деньги назад");
        }
    }

}
