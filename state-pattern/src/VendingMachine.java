public class VendingMachine {
  private State state;

  public VendingMachine() {
    this.state = new NoCoinState();
  }

  public void insertCoin(int coin) {
    state.increaseCoin(coin, this);
  }

  public void select(int productId) {
    state.select(productId, this);
  }

  public void changeState(State newState) {
    this.state = newState;
  }

  public void increaseCoin(int coin) {
    // TODO
  }

  public void decreaseCoin() {
    // TODO
  }

  public void provideProduct(int productId) {
    // TODO
  }

  public boolean hasNoCoin() {
    // TODO
    return false;
  }
}
