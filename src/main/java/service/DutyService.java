package service;


import base.service.BaseEntityService;
import entity.duty.Duty;
import entity.duty.SubDuty;

import java.util.List;

public interface DutyService extends BaseEntityService<Duty, Integer> {
    List<SubDuty> showSubDutiesOfSpecificDuty(Integer id);

}
