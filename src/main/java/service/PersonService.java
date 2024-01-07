package service;

import base.service.BaseEntityService;
import entity.user.Person;

public interface PersonService<T extends Person>
        extends BaseEntityService<T, Integer> {
}