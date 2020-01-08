public class SpecialDiscount {
  public void addDetailTo(Bill bill) {
    bill.addItem(new Item("Special", 10000));
  }
}
