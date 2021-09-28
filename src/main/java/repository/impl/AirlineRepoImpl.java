package repository.impl;

import base.repository.impl.BaseEntityRepoImpl;
import entity.Airline;
import repository.AirlineRepo;

import javax.persistence.EntityManager;

public class AirlineRepoImpl extends BaseEntityRepoImpl<Airline, Long> implements AirlineRepo {


    protected AirlineRepoImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<Airline> getEntityClass() {
        return Airline.class;
    }
}
