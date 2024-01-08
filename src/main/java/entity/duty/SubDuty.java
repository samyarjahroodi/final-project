package entity.duty;

import base.entity.BaseEntity;
import entity.user.Customer;
import entity.user.Expert;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class SubDuty extends BaseEntity<Integer> {

    private String name;

    private String description;

    private Integer price;

    @ManyToOne
    private Duty duty;

    @ManyToMany
    @JoinTable(name = "SubDuty_expert")
    private List<Expert> experts;
}
