public class Stage {
  private static final int ENEMY_COUNT = 100;
  private static final int OBSTACLE_COUNT = 10;
  private EnemyFactory enemyFactory;
  private Boss boss;
  private SmallFlight[] enemies = new SmallFlight[ENEMY_COUNT];
  private Obstacle[] obstacles = new Obstacle[OBSTACLE_COUNT];


  public Stage(int level) {
    enemyFactory = EnemyFactory.getFactory(level);
  }

  private void createEnemies() {
    for (int i = 0; i <= ENEMY_COUNT; i++) {
      enemies[i] = enemyFactory.createSmallFlight();
    }
    boss = enemyFactory.createBoss();
  }

  private void createObstacle() {
    for (int i = 0; i < OBSTACLE_COUNT; i++) {
      obstacles[i] = enemyFactory.createObstacle();
    }
  }
}
