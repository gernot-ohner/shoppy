package dev.ohner.shoppy.service;

import dev.ohner.shoppy.model.MealPlan;
import dev.ohner.shoppy.persistence.IngredientRepository;
import dev.ohner.shoppy.persistence.RecipeRepository;
import dev.ohner.shoppy.persistence.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class MealPlanGeneratorService {

    private static final Integer NUMBER_OF_MEALS = 2;

    private final RecipeRepository recipeRepository;

    public MealPlanGeneratorService(RecipeRepository recipeRepository, IngredientRepository ingredientRepository) {
        this.recipeRepository = recipeRepository;
    }

    public MealPlan generate() {

        MealPlan mealPlan = new MealPlan();
        List<Recipe> allRecipes = recipeRepository.findAll();
        Random randy = new Random();

        List<Recipe> recipes = mealPlan.getRecipes();

        for (int i = 0; i < NUMBER_OF_MEALS; i++) {
            recipes.add(allRecipes.remove(randy.nextInt(allRecipes.size())));
        }

        var ingredients = recipes.stream().flatMap(recipe ->
                recipe.getIngredients().stream())
                .distinct()
                .collect(Collectors.toList());

        mealPlan.setIngredients(ingredients);

        System.out.println(mealPlan);

        return mealPlan;

    }


}
