package entity.operation;

import base.entity.BaseEntity;
import entity.user.Expert;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Suggestion extends BaseEntity<Integer> {
    @Column(name = "suggested_price", nullable = false)
    private int suggestedPrice;

    @Column(name = "when_suggestion_created", nullable = false)
    private LocalDate whenSuggestionCreated;

    @Column(name = "suuggested_time_to_start_the_project", nullable = false)
    private LocalDate suggestedTimeToStartTheProject;

    @Column(name = "days_that_taken", nullable = false)
    private int daysThatTaken;

    @ManyToOne
    private CustomerOrder order;

    @ManyToOne
    private Expert expert;


}
