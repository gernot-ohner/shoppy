package dev.ohner.shoppy.persistence.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED, force = true)
@Entity
public class Ingredient {

    @Id
    private final String id;

    private final String name;

}
