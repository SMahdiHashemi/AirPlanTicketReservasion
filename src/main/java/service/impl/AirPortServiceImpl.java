package service.impl;

import base.service.impl.BaseEntityServiceImpl;
import entity.AirPort;
import entity.City;
import repository.AirPortRepo;
import repository.CityRepo;
import service.AirPortService;
import service.CityService;

public class AirPortServiceImpl extends BaseEntityServiceImpl<AirPort, Long, AirPortRepo> implements AirPortService {

    public AirPortServiceImpl(AirPortRepo repository) {
        super(repository);
    }
}
