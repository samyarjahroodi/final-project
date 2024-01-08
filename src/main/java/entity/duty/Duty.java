package entity.duty;

import base.entity.BaseEntity;
import entity.operation.CustomerOrder;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@Entity
public class Duty extends BaseEntity<Integer> {
    private String name;

    @OneToMany(mappedBy = "duty")
    private List<SubDuty> duties;

    @OneToMany(mappedBy = "duty")
    private List<CustomerOrder> orders;

}
