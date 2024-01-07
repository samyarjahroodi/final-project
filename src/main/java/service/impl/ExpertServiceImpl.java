package service.impl;


import base.service.Impl.BaseEntityServiceImpl;
import entity.user.Expert;
import repository.ExpertRepository;
import service.ExpertService;

public class ExpertServiceImpl
        extends BaseEntityServiceImpl<Expert, Integer, ExpertRepository>
        implements ExpertService {

    public ExpertServiceImpl(ExpertRepository repository) {
        super(repository);
    }
}