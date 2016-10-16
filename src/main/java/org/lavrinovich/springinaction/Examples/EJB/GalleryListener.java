package org.lavrinovich.springinaction.Examples.EJB;

/**
 * Created by Mix74rus on 15.10.16.
 */
import java.util.Date;
import javax.persistence.PrePersist;

public class GalleryListener {

    @PrePersist
    public void prePersist(Gallery gallery) {
        gallery.setCreatedAt(new Date());
    }

}