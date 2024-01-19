package entity.operation;

import base.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Comment extends BaseEntity<Integer> {
    private String comment;

    @Max(5)
    @Min(0)
    private Double star;

    @OneToOne
    private CustomerOrder customerOrder;
}
