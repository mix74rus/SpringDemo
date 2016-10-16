package org.lavrinovich.springinaction.package1.Other;

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
}
