public class StatusEmailSender implements StatusObserver {
  @Override
  public void onAbnormalStatus(Status status) {
    sendEmail(status);
  }

  private void sendEmail(Status status) {
    // TODO
  }
}
