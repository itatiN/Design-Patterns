package enemy_manager;

public abstract class Enemy {
    private String name;
    private int lifePoints;
    private int damage;

    public Enemy(String name, int lifePoints, int damage){
        this.name = name;
        this.lifePoints = lifePoints;
        this.damage = damage; 
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String skill() {
        return "Default enemy skill.";
    }
    public abstract Enemy clone();
}
