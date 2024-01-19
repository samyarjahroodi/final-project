package entity.user;

import lombok.*;

import javax.persistence.Entity;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Admin extends Person {
    private boolean isSuperAdmin;
}
