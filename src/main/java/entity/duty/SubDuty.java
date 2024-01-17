package entity.duty;

import base.entity.BaseEntity;
import entity.operation.CustomerOrder;
import entity.user.Expert;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
//@ToString
public class SubDuty extends BaseEntity<Integer> {

    private String name;

    private String description;

    private Integer price;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Duty duty;


    @ManyToMany
    @JoinTable(name = "SubDuty_expert")
    private List<Expert> experts;

    @OneToMany(mappedBy = "duty")
    private List<CustomerOrder> orders;

    @Override
    public String toString() {
        return "SubDuty{" +
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", experts=" + experts +
                '}';
    }

}
