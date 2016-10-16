package org.lavrinovich.springinaction.package1.Other;

/**
 * Created by Mix74rus on 17.09.16.
 */


public class Sonnet29 implements Poem {

    String text = "Sonnet 29";

    public Sonnet29() {
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Sonnet29(String text) {
        this.text = text;
    }

    public void reciti() {
        System.out.println(text);
    }
}
