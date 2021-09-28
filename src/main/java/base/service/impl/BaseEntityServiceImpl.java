package base.service.impl;

import base.domain.BaseEntity;

import base.repository.BaseEntityRepo;
import base.service.BaseEntityService;

import java.io.Serializable;
import java.util.List;

//E extends BaseEntity<ID> is safe
public class BaseEntityServiceImpl<E extends BaseEntity<ID>, ID extends Serializable,
        R extends BaseEntityRepo<E, ID>>
        implements BaseEntityService<E, ID> {

    protected R repository;

    public BaseEntityServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public E add(E e) {
        return repository.add(e);
    }

    @Override
    public E save(E e) {
        return repository.save(e);
    }

    @Override
    public void delete(E e) {
        repository.delete(e);
    }

    @Override
    public E edit(E e) {
        return repository.edit(e);
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }

    @Override
    public boolean isExistById(ID id) {
        return repository.existsById(id);
    }

}

