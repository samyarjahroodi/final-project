package service.impl;


import base.service.Impl.BaseEntityServiceImpl;
import entity.duty.Duty;
import repository.DutyRepository;
import service.DutyService;

public class DutyServiceImpl
        extends BaseEntityServiceImpl<Duty, Integer, DutyRepository>
        implements DutyService {


    public DutyServiceImpl(DutyRepository repository) {
        super(repository);
    }
}