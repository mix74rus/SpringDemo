package org.lavrinovich.springinaction.SpringExamples.Performers;

import org.lavrinovich.springinaction.SpringExamples.Instruments.Instrument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Mix74rus on 15.10.16.
 */
public class Instrumentalist implements Performer {
    private String song;
    private Instrument instrument;

    void tuneInstrument() {
        System.out.println("Instrument tuning");
    }

    public void perform() throws PerformanceException {
        System.out.println("Playing: " + song + " : ");
        instrument.play();
    }

    public Instrumentalist() {
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DemoConf.xml");
        Performer p = (Performer) applicationContext.getBean("instrumentalist");

        p.perform();
    }
}
