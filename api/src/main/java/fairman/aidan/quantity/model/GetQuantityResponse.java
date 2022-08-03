package fairman.aidan.quantity.model;

import java.util.List;
import lombok.Value;

@Value
public class GetQuantityResponse {
  List<String> quantities;
}
