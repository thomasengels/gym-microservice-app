package com.gym.food.domain.model;

import lombok.Getter;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.math.BigInteger;

@MappedSuperclass
public abstract class AbstractEntity {
    @Getter
    @Id
    @GeneratedValue
    private BigInteger id;
}
