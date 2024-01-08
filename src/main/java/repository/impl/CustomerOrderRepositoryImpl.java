package repository.impl;

import base.reposiotry.Impl.BaseEntityRepositoryImpl;
import entity.operation.CustomerOrder;
import repository.CustomerOrderRepository;

import javax.persistence.EntityManager;

public class CustomerOrderRepositoryImpl
        extends BaseEntityRepositoryImpl<CustomerOrder, Integer>
        implements CustomerOrderRepository {

    public CustomerOrderRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<CustomerOrder> getEntityClass() {
        return CustomerOrder.class;
    }
}
