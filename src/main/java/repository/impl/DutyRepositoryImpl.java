package repository.impl;

import base.reposiotry.Impl.BaseEntityRepositoryImpl;
import entity.duty.Duty;
import repository.DutyRepository;

import javax.persistence.EntityManager;

public class DutyRepositoryImpl
        extends BaseEntityRepositoryImpl<Duty, Integer>
        implements DutyRepository {


    public DutyRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Duty> getEntityClass() {
        return Duty.class;
    }
}
