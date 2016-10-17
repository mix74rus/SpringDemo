package org.lavrinovich.springinaction.SpringExamples.Magic;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Created by Mix74rus on 20.09.16.
 */

@Component
@Aspect
public class Magician implements MindReader{
    private String thoughts;

    @Pointcut("execution(* org.lavrinovich.springinaction.SpringExamples.Other.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinkMethod(String thoughts){}

    @Before("thinkMethod(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Перехватываю мысли волонтёра");
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
