package base.repository;

import base.domain.BaseEntity;
import lombok.NonNull;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public interface BaseEntityRepo<E extends BaseEntity<ID>, ID extends Serializable> {

    E add(E e);

    E edit(E e);

    E save(E e);

    void delete(E e);

    List<E> findAll();

    boolean existsById(ID id);

}
