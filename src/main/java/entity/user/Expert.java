package entity.user;

import lombok.*;

import javax.persistence.Entity;
import javax.swing.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.io.File;
import java.time.LocalDate;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Expert extends Person {

    private RegistrationStatus registrationStatus;

    //when expert is registered!!
    private LocalDate localDate;

    //image of the expert!!
    private File file;

    @Max(5)
    @Min(0)
    private int star;
}
