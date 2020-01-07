public abstract class Authenticator {

  // template method
  public Auth authenticate(String id, String pw) throws AuthException {
    if (!doAuthenticate(id, pw)) {
      throw createException();
    }
    return createAuth(id);
  }

  protected abstract boolean doAuthenticate(String id, String pw);

  protected abstract Auth createAuth(String id);

  private RuntimeException createException() throws AuthException {
    throw new AuthException();
  }
}
