package org.lavrinovich.springinaction.Examples.JavaBean;

import java.io.Serializable;

/**
 * Created by Mix74rus on 15.10.16.
 */
public class PersonBean implements Serializable{
    private String name;
    private boolean deceased;

    public PersonBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDeceased() {
        return deceased;
    }

    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonBean that = (PersonBean) o;

        if (deceased != that.deceased) return false;
        return name.equals(that.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (deceased ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PersonBean{" +
                "name='" + name + '\'' +
                ", deceased=" + deceased +
                '}';
    }
}
