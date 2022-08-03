package fairman.aidan.recipe;

import fairman.aidan.api.common.PaginatedResponse;
import fairman.aidan.recipe.model.AddRecipeRequest;
import fairman.aidan.recipe.model.Recipe;
import fairman.aidan.recipe.model.RecipeResponse;
import fairman.aidan.recipe.model.UpdateRecipeRequest;
import fairman.aidan.recipe.model.UpdateRecipeResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(path = "/recipe")
public interface RecipeApi {

  @PostMapping
  void addRecipe(@RequestBody AddRecipeRequest request);

  @PutMapping(path = "/{recipeId}")
  UpdateRecipeResponse updateRecipe(UpdateRecipeRequest request, @PathVariable int recipeId);

  @GetMapping(path = "/{recipeName}")
  RecipeResponse getRecipe(@PathVariable String recipeName);

  @GetMapping
  PaginatedResponse<Recipe> getRecipes();
}
