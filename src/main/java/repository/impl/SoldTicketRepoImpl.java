package repository.impl;

import base.repository.impl.BaseEntityRepoImpl;
import entity.City;
import entity.SoldTicket;
import repository.CityRepo;
import repository.SoldTicketRepo;

import javax.persistence.EntityManager;

public class SoldTicketRepoImpl extends BaseEntityRepoImpl<SoldTicket, Long> implements SoldTicketRepo {


    protected SoldTicketRepoImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public Class<SoldTicket> getEntityClass() {
        return SoldTicket.class;
    }
}
