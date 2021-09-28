package service.impl;

import base.service.impl.BaseEntityServiceImpl;
import entity.City;
import entity.Travel;
import repository.CityRepo;
import repository.TravelRepo;
import service.CityService;
import service.TravelService;

public class TravelServiceImpl extends BaseEntityServiceImpl<Travel, Long, TravelRepo> implements TravelService {

    public TravelServiceImpl(TravelRepo repository) {
        super(repository);
    }
}
