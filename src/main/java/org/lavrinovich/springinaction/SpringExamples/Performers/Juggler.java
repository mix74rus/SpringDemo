package org.lavrinovich.springinaction.SpringExamples.Performers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mix74rus on 17.09.16.
 */

public class Juggler implements Performer {

    private int beanBags;

    public int getBeanBags() {
        return beanBags;
    }

    public void setBeanBags(int beanBags) {
        this.beanBags = beanBags;
    }

    public Juggler(){}

    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }

    public void perform() throws PerformanceException {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DemoConf.xml");
        Performer p = (Performer) applicationContext.getBean("juggler");

        p.perform();
    }
}
