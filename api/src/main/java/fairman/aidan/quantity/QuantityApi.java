package fairman.aidan.quantity;

import fairman.aidan.quantity.model.AddQuantityRequest;
import fairman.aidan.quantity.model.GetQuantityResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/quantity")
public interface QuantityApi {
  @PostMapping
  void addQuantity(@RequestBody AddQuantityRequest request);
  @GetMapping
  GetQuantityResponse getQuantityList();
}
