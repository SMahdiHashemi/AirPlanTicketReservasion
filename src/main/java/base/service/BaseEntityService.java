package base.service;

import base.domain.BaseEntity;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseEntityService<E extends BaseEntity<ID>, ID extends Serializable> {

    E add(E e);

    E save(E e);

    void delete(E e);

    E edit(E e);

    List<E> findAll();

    boolean isExistById(ID id);

}
