package fairman.aidan.tag;

import fairman.aidan.api.common.PaginatedResponse;
import fairman.aidan.tag.model.AddTagRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(path = "/tag")
public interface TagApi {
  @PostMapping
  void addTag(@RequestBody AddTagRequest request);

  @GetMapping
  PaginatedResponse<String> getTags();
}
