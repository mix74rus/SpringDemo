package org.lavrinovich.springinaction.Examples.EJB;

/**
 * Created by Mix74rus on 15.10.16.
 */
import javax.ejb.ApplicationException;

@ApplicationException(rollback=true)
/**
 * Пример Entity Bean
 */
public class GalleryNotFoundException extends Exception {

    public GalleryNotFoundException() {
    }

    public GalleryNotFoundException(String message) {
        super(message);
    }
}