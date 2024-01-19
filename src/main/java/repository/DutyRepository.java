package repository;

import base.reposiotry.BaseEntityRepository;
import entity.duty.Duty;
import entity.duty.SubDuty;

import java.util.List;

public interface DutyRepository extends BaseEntityRepository<Duty, Integer> {
    List<SubDuty> showSubDutiesOfSpecificDuty(Integer id);
}
