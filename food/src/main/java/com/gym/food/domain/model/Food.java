package com.gym.food.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Map;

@Entity
public class Food extends AbstractEntity{
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private FoodType foodType;

    @Getter
    @Setter
    @JsonIgnore
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(name = "FTT_REGISTRI_ESCLUSIONI", foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "FTT_FK_ESCLUSIONE_TO_REGISTRO"), joinColumns = @JoinColumn(name = "REGISTRO_ID"))
    @MapKeyColumn(name = "CLAUSOLA_ESCLUSIONE", length = 40, nullable = false)
    @MapKeyClass(Nutrient.class)
    @MapKeyEnumerated(EnumType.STRING)
    @Column(name = "RECORD_COUNT", nullable = false)
    private Map<Nutrient, Integer> nutrients;
}
