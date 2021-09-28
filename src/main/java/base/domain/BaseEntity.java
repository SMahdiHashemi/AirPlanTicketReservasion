package base.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass

public abstract class BaseEntity<ID extends Serializable> implements Serializable {

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Id
    @GeneratedValue
    private ID id;



}
