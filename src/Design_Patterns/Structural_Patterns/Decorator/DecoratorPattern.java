package Design_Patterns.Structural_Patterns.Decorator;

interface coffee {
    double getCost();
    String getIngredients();
}

class SimpleCoffee implements coffee {
    @Override
    public double getCost() {
        return 1;
    }
    @Override
    public String getIngredients() {
        return "Coffee";
    }
}

class CoffeeDecorator implements coffee {
    protected final coffee decoratedCoffee;
    protected String ingredientSeparator = ", ";
    public CoffeeDecorator(coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
    @Override
    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}

class Milk extends CoffeeDecorator {
    public Milk(coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Milk";
    }
}

class WhipCoffee extends CoffeeDecorator {
    public WhipCoffee(coffee decoratedCoffee) {
        super(decoratedCoffee);
    }
    @Override
    public double getCost() {
        return super.getCost() + 0.7;
    }
    @Override
    public String getIngredients() {
        return super.getIngredients() + ingredientSeparator + "Whip";
    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        coffee someCoffee = new SimpleCoffee();
        System.out.println("Cost: " + someCoffee.getCost() + "; Ingredients: " + someCoffee.getIngredients());
        someCoffee = new Milk(someCoffee);
        System.out.println("Cost: " + someCoffee.getCost() + "; Ingredients: " + someCoffee.getIngredients());
        someCoffee = new WhipCoffee(someCoffee);
        System.out.println("Cost: " + someCoffee.getCost() + "; Ingredients: " + someCoffee.getIngredients());
    }
}
