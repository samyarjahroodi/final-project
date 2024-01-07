package repository.impl;

import base.reposiotry.Impl.BaseEntityRepositoryImpl;
import entity.user.Expert;
import repository.ExpertRepository;

import javax.persistence.EntityManager;

public class ExpertRepositoryImpl
        extends BaseEntityRepositoryImpl<Expert, Integer>
        implements ExpertRepository {


    public ExpertRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Expert> getEntityClass() {
        return Expert.class;
    }
}
