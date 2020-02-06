package com.gym.user.domain.model;

import com.gym.common.domain.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class User extends AbstractEntity {
    String name;
}
