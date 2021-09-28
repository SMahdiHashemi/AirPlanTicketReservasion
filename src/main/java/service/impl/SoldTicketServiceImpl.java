package service.impl;

import base.service.impl.BaseEntityServiceImpl;
import entity.SoldTicket;
import entity.Travel;
import repository.SoldTicketRepo;
import repository.TravelRepo;
import service.SoldTicketService;
import service.TravelService;

public class SoldTicketServiceImpl extends BaseEntityServiceImpl<SoldTicket, Long, SoldTicketRepo> implements SoldTicketService {

    public SoldTicketServiceImpl(SoldTicketRepo repository) {
        super(repository);
    }
}
