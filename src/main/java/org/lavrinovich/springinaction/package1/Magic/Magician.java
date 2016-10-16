package org.lavrinovich.springinaction.package1.Magic;

import org.springframework.stereotype.Component;

/**
 * Created by Mix74rus on 20.09.16.
 */

@Component
public class Magician implements MindReader{
    private String thougths;

    public void interceptThoughts(String thoughts) {
        System.out.println("Перехватываю мысли волонтёра");
        this.thougths = thoughts;
    }

    public String getThougths() {
        return thougths;
    }
}
