package service.impl;


import base.service.Impl.BaseEntityServiceImpl;
import entity.operation.Suggestion;
import entity.user.Expert;
import repository.ExpertRepository;
import service.ExpertService;

import java.util.List;

public class ExpertServiceImpl
        extends BaseEntityServiceImpl<Expert, Integer, ExpertRepository>
        implements ExpertService {

    public ExpertServiceImpl(ExpertRepository repository) {
        super(repository);
    }

    @Override
    public double averageStarOfExpert(Expert expert) {
        return repository.averageStarOfExpert(expert);
    }
}