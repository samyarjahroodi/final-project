package entity.duty;

import base.entity.BaseEntity;
import entity.user.Customer;
import entity.user.Expert;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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

    @ManyToMany
    private List<Customer> customers;

    @ManyToMany
    @JoinTable(name = "duty_expert")
    private List<Expert> experts;

    @OneToMany(mappedBy = "duty")
    private List<SubDuty> duties;

}
