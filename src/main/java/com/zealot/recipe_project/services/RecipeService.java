package com.zealot.recipe_project.services;

import com.zealot.recipe_project.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
