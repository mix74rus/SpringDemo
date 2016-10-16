package org.lavrinovich.springinaction.Examples.EJB;

/**
 * Created by Mix74rus on 15.10.16.
 */
import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
public class GalleryAlreadyExistsException extends Exception {

    private String name;

    public GalleryAlreadyExistsException() {
    }

    public GalleryAlreadyExistsException(String message, String name) {
        super(message);
    }

    public String getName() {
        return name;
    }
}
