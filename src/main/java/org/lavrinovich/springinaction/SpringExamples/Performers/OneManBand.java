package org.lavrinovich.springinaction.SpringExamples.Performers;

import org.lavrinovich.springinaction.SpringExamples.Instruments.Instrument;

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
}
