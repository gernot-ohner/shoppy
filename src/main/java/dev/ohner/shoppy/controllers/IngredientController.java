package dev.ohner.shoppy.controllers;

import dev.ohner.shoppy.persistence.model.Ingredient;
import dev.ohner.shoppy.persistence.IngredientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @GetMapping
    public List<Ingredient> index() {
        return ingredientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient show(@PathVariable String id) {
        return ingredientRepository.findById(id).orElseThrow();
    }

    @PostMapping
    public void add(@RequestBody Ingredient ing) {
        ingredientRepository.save(ing);
    }

//    @PutMapping("/{id}")
//    public void replace(@RequestBody Ingredient newIngredient, @PathVariable String id) {
//        ingredientRepository.findById(id).map(ingredient -> {
//            ingredient.setId(id);
//            ingredient.setName(newIngredient.getName());
//            return ingredientRepository.save(ingredient);
//        }).orElseGet(() -> {
//            newIngredient.setId(id);
//            return ingredientRepository.save(newIngredient);
//        });
//    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        ingredientRepository.deleteById(id);
    }
}
