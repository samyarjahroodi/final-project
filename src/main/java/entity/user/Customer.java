package entity.user;

import entity.operation.CustomerOrder;
import entity.utility.Wallet;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Customer extends Person {
    @OneToMany(mappedBy = "customer")
    private List<CustomerOrder> orders;

    @OneToOne
    private Wallet wallet;

}
