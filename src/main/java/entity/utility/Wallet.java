package entity.utility;

import base.entity.BaseEntity;
import lombok.*;

import javax.persistence.Entity;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Wallet extends BaseEntity<Integer> {
    private int creditOfWallet;

}
