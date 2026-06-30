public class TypeAPlugAdapter implements PlugAdapter {
    private final TypeAOutlet outlet;

    public TypeAPlugAdapter(TypeAOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public void plugIn() {
        outlet.connectPlug();
    }

}