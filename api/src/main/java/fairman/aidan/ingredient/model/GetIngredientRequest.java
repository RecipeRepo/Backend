package fairman.aidan.ingredient.model;

import lombok.Value;

@Value
public class GetIngredientRequest {
  String name;
  String category;
}
