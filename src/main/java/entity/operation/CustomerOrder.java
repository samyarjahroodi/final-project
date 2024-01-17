package entity.operation;

import base.entity.BaseEntity;
import entity.duty.Duty;
import entity.duty.SubDuty;
import entity.user.Customer;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "customer_order")
public class CustomerOrder extends BaseEntity<Integer> {
    private String description;

    private int price;

    //time of order!!!
    @Column(name = "time_of_order")
    private LocalDate timeOfOrder;

    private String address;

    @Enumerated(EnumType.STRING)
    private Status status;

    //this star is for expert,we get the average of all the projects and then set it to the expert!!
    @Column(name = "start_of_the_project")
    private int starOfTheProject;

    @ManyToOne
    private Duty duty;

    @ManyToOne
    private SubDuty subDuty;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "order")
    private List<Suggestion> suggestions;


}