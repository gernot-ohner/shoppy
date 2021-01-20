package dev.ohner.shoppy.persistence;

import dev.ohner.shoppy.persistence.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RecipeRepository extends JpaRepository<Recipe, String> {}
