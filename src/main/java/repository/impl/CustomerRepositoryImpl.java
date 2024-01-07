package repository.impl;

import base.reposiotry.Impl.BaseEntityRepositoryImpl;
import entity.user.Customer;
import repository.CustomerRepository;

import javax.persistence.EntityManager;

public class CustomerRepositoryImpl
        extends BaseEntityRepositoryImpl<Customer, Integer>
        implements CustomerRepository {


    public CustomerRepositoryImpl(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    protected Class<Customer> getEntityClass() {
        return Customer.class;
    }
}
