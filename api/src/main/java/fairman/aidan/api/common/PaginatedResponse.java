package fairman.aidan.api.common;

import java.util.List;
import lombok.Value;
import lombok.experimental.NonFinal;

@Value
@NonFinal
public class PaginatedResponse<T> {
  List<T> items;
  int pageNumber;
  long totalCount;
  int totalPages;
  int currentPageCount(){
    return items.size();
  }
}
