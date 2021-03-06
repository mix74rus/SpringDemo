package org.lavrinovich.springinaction.SpringExamples.Performers;

import org.lavrinovich.springinaction.SpringExamples.Instruments.Instrument;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Mix74rus on 18.09.16.
 */


public class OneManBand implements Performer {


    private List<Instrument> instruments;

    public OneManBand() {
    }

    public void perform() throws PerformanceException {
        for(Instrument instrument: instruments) {
            instrument.play();
        }
    }

    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
    }

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("DemoConf.xml");
        Performer p = (Performer) applicationContext.getBean("oneManBand");

        p.perform();
    }
}
