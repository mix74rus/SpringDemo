package org.lavrinovich.springinaction.Examples.EJB;

/**
 * Created by Mix74rus on 15.10.16.
 */
import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.Size;


@Entity
@EntityListeners({GalleryListener.class})
@Table(name = "gallery",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = {"id"})
        }
)
@NamedQueries({
        @NamedQuery(name = Gallery.QUERY_FIND_ALL, query = "SELECT g FROM Gallery g ORDER BY g.name ASC"),
        @NamedQuery(name = Gallery.QUERY_FIND_BY_NAME, query = "SELECT g FROM Gallery g WHERE g.name = :name")
})
/**
 * Пример Entity Bean
 */
public class Gallery implements Serializable {

    private static final long serialVersionUID = 1L;

    public static final String QUERY_FIND_ALL = "Gallery.findAll";
    public static final String QUERY_FIND_BY_NAME = "Gallery.findByName";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 100)
    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public Gallery() {
    }

    public Gallery(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Gallery other = (Gallery) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

}
