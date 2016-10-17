package org.lavrinovich.springinaction.SpringExamples;

import junit.framework.TestCase;
import org.lavrinovich.springinaction.SpringExamples.Magic.MindReader;
import org.lavrinovich.springinaction.SpringExamples.Other.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Mix74rus on 20.09.16.
 */
@Component
public class TryTest  extends TestCase{

    private static ApplicationContext appletContext;
    static {
        appletContext = new ClassPathXmlApplicationContext("conf_Test1.xml");
        volunteer = appletContext.getBean(Thinker.class);
        magician = appletContext.getBean(MindReader.class);
    }


    private static Thinker volunteer;

    private static MindReader magician;

//    public TryTest() {
//        volunteer = appletContext.getBean(Thinker.class);
//        magician = appletContext.getBean(MindReader.class);
//    }



    public void testApp() {
        volunteer.thinkOfSomething("123");
        assertEquals("123",magician.getThoughts());
    }
}
