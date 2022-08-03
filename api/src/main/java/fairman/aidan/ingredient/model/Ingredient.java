package fairman.aidan.ingredient.model;

import java.util.List;
import lombok.Value;

@Value
public class Ingredient {
  String name;
  List<String> categories;
}
