public class BillController {
  private SpecialDiscountFactory specialDiscountFactory = new SpecialDiscountFactory();


  public Bill createBill(Customer customer) {
    Bill bill = new Bill();
    SpecialDiscount specialDiscount = specialDiscountFactory.create(customer);
    // do not need the null checking
    specialDiscount.addDetailTo(bill);

    return bill;
  }
}
