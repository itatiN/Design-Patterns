public class TypeBPlugAdapter implements PlugAdapter {
    private final TypeBOutlet outlet;

    public TypeBPlugAdapter(TypeBOutlet outlet) {
        this.outlet = outlet;
    }

    @Override
    public void plugIn() {
        outlet.connectPlug();
    }

}