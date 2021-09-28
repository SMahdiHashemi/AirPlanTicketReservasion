package service.impl;

import base.service.impl.BaseEntityServiceImpl;
import entity.Airline;
import repository.AirlineRepo;
import service.AirlineService;

public class AirlineServiceImpl extends BaseEntityServiceImpl<Airline, Long, AirlineRepo> implements AirlineService {

    public AirlineServiceImpl(AirlineRepo repository) {
        super(repository);
    }
}
