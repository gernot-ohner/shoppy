package dev.ohner.shoppy.controllers;

import dev.ohner.shoppy.model.MealPlan;
import dev.ohner.shoppy.service.MealPlanGeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealPlanController {

    private final MealPlanGeneratorService mealPlanGeneratorService;

    public MealPlanController(MealPlanGeneratorService mealPlanGeneratorService) {
        this.mealPlanGeneratorService = mealPlanGeneratorService;
    }

    @GetMapping("/mealplan")
    public MealPlan getMealplan() {
        return mealPlanGeneratorService.generate();
    }
}
