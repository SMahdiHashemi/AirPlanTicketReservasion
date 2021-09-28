package service.impl;

import base.service.impl.BaseEntityServiceImpl;
import entity.City;
import repository.CityRepo;
import service.CityService;

public class CityServiceImpl extends BaseEntityServiceImpl<City, Long, CityRepo> implements CityService {

    public CityServiceImpl(CityRepo repository) {
        super(repository);
    }
}
