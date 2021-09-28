package repository.impl;

import base.repository.impl.BaseEntityRepoImpl;
import entity.City;
import entity.Travel;
import repository.CityRepo;
import repository.TravelRepo;

import javax.persistence.EntityManager;

public class TravelRepoImpl extends BaseEntityRepoImpl<Travel, Long> implements TravelRepo {


    protected TravelRepoImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Travel> getEntityClass() {
        return Travel.class;
    }
}
