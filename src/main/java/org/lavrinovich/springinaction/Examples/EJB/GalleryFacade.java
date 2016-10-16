package org.lavrinovich.springinaction.Examples.EJB;

/**
 * Created by Mix74rus on 15.10.16.
 */

import java.util.List;
import javax.ejb.*;


@Stateless
@LocalBean
public class GalleryFacade {

    @EJB
    private GalleryEAO galleryEAO;

    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public Gallery findById(Long id) throws GalleryNotFoundException {
        Gallery gallery = galleryEAO.find(id);
        if (gallery == null) throw new GalleryNotFoundException("Gallery not found");
        return gallery;
    }

    @TransactionAttribute(TransactionAttributeType.SUPPORTS)
    public List<Gallery> findAll() {
        return galleryEAO.findAll();
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void create(String name) throws GalleryAlreadyExistsException {
        if (galleryEAO.findByName(name) != null) throw new GalleryAlreadyExistsException("Gallery already exists", name);
        Gallery gallery = new Gallery(name);
        galleryEAO.persist(gallery);
    }

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void remove(Long id) throws GalleryNotFoundException {
        Gallery gallery = findById(id);
        galleryEAO.remove(gallery);
    }
}