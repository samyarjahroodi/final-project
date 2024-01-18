package service;


import base.service.BaseEntityService;
import entity.user.Customer;

public interface CustomerService extends BaseEntityService<Customer, Integer> {
    Customer getId(String username, String password);
}
