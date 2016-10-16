package org.lavrinovich.springinaction.Examples.JavaBean;

/**
 * Created by Mix74rus on 15.10.16.
 */
public class TestPersonBean {
    public static void main(String[] args) {

        PersonBean person = new PersonBean();
        person.setName("Bob");
        person.setDeceased(true);

        System.out.print(person.getName());
        System.out.println(person.isDeceased() ? " [deceased]" : " [alive]");
    }
}
