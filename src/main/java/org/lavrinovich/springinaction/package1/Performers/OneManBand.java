package org.lavrinovich.springinaction.package1.Performers;

import org.lavrinovich.springinaction.package1.Instruments.Instrument;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
