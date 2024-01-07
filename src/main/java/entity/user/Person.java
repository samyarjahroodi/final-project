package entity.user;

import base.entity.BaseEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@MappedSuperclass
//@Builder
@SuppressWarnings("unused")
public class Person extends BaseEntity<Integer> {
    @Column(nullable = false)
    private String firstname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false, unique = true)
    private String username;

}
