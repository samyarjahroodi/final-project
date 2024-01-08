package entity.user;

import entity.operation.Suggestion;
import entity.utility.Wallet;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.File;
import java.time.LocalDate;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Expert extends Person {
    @Column(name = "registration_status",nullable = false)
    private RegistrationStatus registrationStatus;

    //when expert is registered!!
    @Column(name="when_expert_registered",nullable = false)
    private LocalDate whenExpertRegistered;

    //image of the expert!!
    private File file;

    @Max(5)
    @Min(0)
    private int star;

    @OneToMany(mappedBy = "expert")
    private List<Suggestion> suggestions;

    @OneToOne
    private Wallet wallet;
}
