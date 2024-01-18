package service;


import base.service.BaseEntityService;
import entity.user.Expert;

public interface ExpertService extends BaseEntityService<Expert, Integer> {
    double averageStarOfExpert(Expert expert);

     void changeRegistrationStatus(Integer id);
}
