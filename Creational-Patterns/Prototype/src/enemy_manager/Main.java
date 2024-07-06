package enemy_manager;

public class Main {
    public static void main(String[] args) {
        EnemyManager manager = new EnemyManager();

        Enemy zombie = manager.getEnemy("zombie");
        Enemy beholder = manager.getEnemy("beholder");

        System.out.println("Created: " + zombie.getName());
        System.out.println("What they do:" + zombie.skill());
        System.out.println("Created: " + beholder.getName());
        System.out.println("What they do: " + beholder.skill());
    }
}
