public class SpecialDiscountFactory {
  public SpecialDiscount create(Customer customer) {
    if (havingSpecialDiscount(customer)) {
      return new NewCustomerDiscount();
    } else {
      return new NullSpecialDiscount();
    }
  }

  private boolean havingSpecialDiscount(Customer customer) {
    return false;
  }
}
