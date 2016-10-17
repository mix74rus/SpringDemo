package org.lavrinovich.springinaction.SpringExamples.Other;

import org.lavrinovich.springinaction.SpringExamples.Magic.MindReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Mix74rus on 20.09.16.
 */

@Component
public class Volunteer implements Thinker {
    private String thoughts;

    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DemoConf.xml");
        Thinker thinker = (Thinker) applicationContext.getBean("volunteer");
        MindReader mindReader = (MindReader) applicationContext.getBean("magician");
        thinker.thinkOfSomething("Something");
        System.out.println(mindReader.getThoughts());
    }
}
