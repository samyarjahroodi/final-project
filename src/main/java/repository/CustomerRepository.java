package repository;

import base.reposiotry.BaseEntityRepository;
import entity.user.Customer;

public interface CustomerRepository extends BaseEntityRepository<Customer, Integer> {
    Customer getId(String username, String password);
}
