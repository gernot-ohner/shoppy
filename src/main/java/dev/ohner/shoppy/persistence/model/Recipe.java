package dev.ohner.shoppy.persistence.model;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PUBLIC, force = true)
@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private final String id;

    private final String name;

    @ManyToMany(targetEntity = Ingredient.class)
    private final Set<Ingredient> ingredients;
}
