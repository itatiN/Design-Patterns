package enemy_manager;

public class Zombie extends Enemy {
    public Zombie(){
        super("Zombie", 100, 10);
    }

    @Override
    public String skill() {
        return "They walk dead...get it?";
    }

    @Override
    public Enemy clone() {
        return new Zombie();
    }
}
