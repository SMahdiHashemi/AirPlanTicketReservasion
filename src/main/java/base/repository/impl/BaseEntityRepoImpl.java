package base.repository.impl;

import base.domain.BaseEntity;
import base.repository.BaseEntityRepo;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

public abstract class BaseEntityRepoImpl<E extends BaseEntity<ID>, ID extends Serializable>
        implements BaseEntityRepo<E, ID> {

    protected final EntityManager entityManager;
    public abstract Class<E> getEntityClass();


    protected BaseEntityRepoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public E add(E e) {
        entityManager.persist(e);
        return e;
    }

    @Override
    public E edit(E e) {
        return entityManager.merge(e);
    }

    @Override
    public E save(E e) {
        if (e.getId() == null) {
            entityManager.persist(e);
            return e;
        } else {
            return entityManager.merge(e);
        }
    }

    @Override
    public void delete(E e) {
        entityManager.remove(e);
    }

    @Override
    public List<E> findAll() {
        return entityManager.createQuery(
                "from " + getEntityClass().getSimpleName(),
                getEntityClass()
        ).getResultList();
    }

    @Override
    public boolean existsById(ID id) {
        return entityManager.createQuery(
                        "select count(id) from " + getEntityClass().getSimpleName() +
                                " where id = :id",
                        Long.class
                ).setParameter("id", id)
                .getSingleResult() == 1L;
    }

    //there is no in interface cuse you can not find it
    public void test(){

    }
}
