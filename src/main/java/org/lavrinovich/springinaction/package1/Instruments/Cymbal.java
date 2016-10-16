package org.lavrinovich.springinaction.package1.Instruments;

import org.springframework.stereotype.Component;

/**
 * Created by Mix74rus on 18.09.16.
 */

@Component
public class Cymbal implements Instrument{
    public void play() {
        System.out.println("Cymbal play");
    }
}
