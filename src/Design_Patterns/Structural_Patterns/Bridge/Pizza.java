package Design_Patterns.Structural_Patterns.Bridge;

public abstract class Pizza {
    protected String sauce;
    protected String toppings;
    protected String crust;

    public abstract void deliver();
}
