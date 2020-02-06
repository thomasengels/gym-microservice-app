package com.gym.common.domain;

import javax.persistence.*;
import java.math.BigInteger;

@MappedSuperclass
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return this.id;
    }
}
