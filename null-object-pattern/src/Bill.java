import java.util.ArrayList;
import java.util.List;

public class Bill {
  List<Item> items = new ArrayList<>();

  void addItem(Item item) {
    items.add(item);
  }
}
