package repository.impl;

import base.repository.impl.BaseEntityRepoImpl;
import entity.City;
import repository.CityRepo;

import javax.persistence.EntityManager;

public class CityRepoImpl extends BaseEntityRepoImpl<City, Long> implements CityRepo {


    protected CityRepoImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<City> getEntityClass() {
        return City.class;
    }
}
