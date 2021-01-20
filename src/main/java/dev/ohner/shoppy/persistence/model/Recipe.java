package dev.ohner.shoppy.persistence.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final long id;
    private final String name;

    private final Integer preparationTimeInMinutes;
    private final Integer cookingTimeInMinutes;

    @ManyToMany(targetEntity = Ingredient.class)
    private final Set<Ingredient> ingredients;
}
