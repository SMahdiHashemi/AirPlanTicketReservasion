package repository.impl;

import base.repository.impl.BaseEntityRepoImpl;
import entity.AirPort;
import entity.City;
import repository.AirPortRepo;
import repository.CityRepo;

import javax.persistence.EntityManager;

public class AirPortRepoImpl extends BaseEntityRepoImpl<AirPort, Long> implements AirPortRepo {


    protected AirPortRepoImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<AirPort> getEntityClass() {
        return AirPort.class;
    }
}
