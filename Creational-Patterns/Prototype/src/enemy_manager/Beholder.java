package enemy_manager;

public class Beholder extends Enemy {
    public Beholder(){
        super("Beholder", 1000, 100);
    }

    @Override
    public String skill() {
        return "Laser eyes..idk";
    }

    @Override
    public Enemy clone() {
        return new Beholder();
    }
}
