package fairman.aidan.ingredient;

import fairman.aidan.api.common.PaginatedResponse;
import fairman.aidan.ingredient.model.AddIngredientRequest;
import fairman.aidan.ingredient.model.GetIngredientRequest;
import fairman.aidan.ingredient.model.Ingredient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping(path = "/interface")
public interface IngredientApi {
  @PostMapping
  void addIngredient(AddIngredientRequest request);
  @GetMapping
  PaginatedResponse<Ingredient> getIngredients(@RequestBody GetIngredientRequest request, @RequestParam int page, @RequestParam int itemsPerPage);
}
