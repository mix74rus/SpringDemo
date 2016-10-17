package org.lavrinovich.springinaction.SpringExamples.Performers;

import org.lavrinovich.springinaction.SpringExamples.Other.Poem;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mix74rus on 17.09.16.
 */

public class PoeticJuggler extends Juggler {
    private Poem poem;


    public PoeticJuggler(Poem poem) {
        super(10);
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        System.out.println("While reciting ...");
        poem.reciti();
    }

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DemoConf.xml");
        Performer p = (Performer) applicationContext.getBean("poeticJuggler");
        p.perform();
    }
}
