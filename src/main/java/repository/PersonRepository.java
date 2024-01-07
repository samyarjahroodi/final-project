package repository;

import base.reposiotry.BaseEntityRepository;
import entity.user.Person;

public interface PersonRepository<T extends Person>
        extends BaseEntityRepository<T, Integer> {
}
