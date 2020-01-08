public abstract class EnemyFactory {
  public static EnemyFactory getFactory(int level) {
    if (level == 1) {
      return new EasyStageEnemyFactory();
    } else {
      return new HardEnemyFactory();
    }
  }

  public abstract Boss createBoss();
  public abstract SmallFlight createSmallFlight();
  public abstract Obstacle createObstacle();
}
