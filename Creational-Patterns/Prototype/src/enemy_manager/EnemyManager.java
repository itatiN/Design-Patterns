package enemy_manager;

import java.util.HashMap;
import java.util.Map;

public class EnemyManager {
    private Map<String, Enemy> enemies = new HashMap<>();

    public EnemyManager() {
        enemies.put("zombie", new Zombie());
        enemies.put("beholder", new Beholder());
    }

    public Enemy getEnemy(String type) {
        Enemy prototype = enemies.get(type);
        if (prototype != null) {
            return prototype.clone();
        } else {
            return null;
        }
    }
}
