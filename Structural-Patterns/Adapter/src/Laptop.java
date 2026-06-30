public class Laptop {
    private final PlugAdapter plugAdapter;
    
    public Laptop(PlugAdapter plugAdapter) {
        this.plugAdapter = plugAdapter;
    }

    public void charge() {
        plugAdapter.plugIn();
    }
}
